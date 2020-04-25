package com.belajar.crudwithjwt.controller.mynt;

import com.belajar.crudwithjwt.model.mynt.CompanyBanksAccountModel;
import com.belajar.crudwithjwt.model.mynt.CompanyTransactionsInquiryModel;
import com.belajar.crudwithjwt.repository.mynt.company.CompanyBanksAccountRepository;
import com.belajar.crudwithjwt.repository.mynt.company.CompanyTransactionInquiryRepository;
import com.belajar.crudwithjwt.utils.Utils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.DatatypeConverter;

import static com.belajar.crudwithjwt.utils.Utils.convertStreamToString;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CompanyController {

    @Autowired
    private CompanyBanksAccountRepository companyBanksAccountRepository;

    @Autowired
    private CompanyTransactionInquiryRepository companyTransactionInquiryRepository;

    public CompanyController(CompanyBanksAccountRepository companyBanksAccountRepository, CompanyTransactionInquiryRepository companyTransactionInquiryRepository) {
        this.companyBanksAccountRepository = companyBanksAccountRepository;
    }

    private CompanyResponse companyResponse = new CompanyResponse();

    @PostMapping("/mynt/company")
    public Map<String, Object> login(@RequestParam Map<String, String> body) {
        String function = body.get("function");
        String username = body.get("username");
        String password = body.get("password");
        String token = body.get("token");

        String bank_code = body.get("bank_code");
        String account_number = body.get("account_number");
        String account_name = body.get("account_name");
        String relationship = body.get("relationship");
        String regency_code = body.get("regency_code");
        String province_code = body.get("province_code");
        String id_number = body.get("id_number");
        String address = body.get("address");

        String trace_id = body.get("trace_id");
        String service_code = body.get("service_code");
        String bank_name = body.get("bank_name");
        String amount = body.get("amount");
        String inquired_at = body.get("inquired_at");



        Map<String, Object> maps = new HashMap<>();

        switch (function) {
            case "company.login":
                maps = companyResponse.companyLogin();
                break;
            case "company.login.otp":
                maps = companyResponse.companyLoginOtp();
                break;
            case "company.logout":
                maps = companyResponse.companyLogout();
                break;
            case "company.profiles":
                maps = companyResponse.companyProfiles();
                break;
            case "company.logs.access":
                maps = companyResponse.companyLogAccess();
                break;
            case "company.logs.notifications":
                maps = companyResponse.companyLogNotifications();
                break;
            case "company.profiles.update.identity":
                maps = companyResponse.companyProfilesUpdateIdentity();
                break;
            case "company.profiles.update.avatar":
                maps = companyResponse.companyProfilesUpdateAvatar();
                break;
            case "company.profiles.update.credential":
                maps = companyResponse.companyProfilesUpdateCredential();
                break;
            case "company.profiles.check.phone":
                maps = companyResponse.companyProfilesCheckPhone();
                break;
            case "company.profiles.update.phone":
                maps = companyResponse.companyProfilesUpdatePhone();
                break;
            case "company.pin.change":
                maps = companyResponse.companyPinChange();
                break;
            case "company.pin.forgot":
                maps = companyResponse.companyPinForgot();
                break;
            case "company.password.forgot.request":
                maps = companyResponse.companyPasswordForgotRequest();
                break;
            case "company.password.forgot.change":
                maps = companyResponse.companyPasswordForgotChange();
                break;
            case "company.merchant.types":
                maps = companyResponse.companyMerchantTypes();
                break;
            case "company.merchant.register":
                maps = companyResponse.companyMerchantRegister();
                break;
            case "company.merchant.settlement.schedule":
                maps = companyResponse.companyMerchantSettlementSchedule();
                break;
            case "company.accounts.merchants":
                maps = companyResponse.companyAccountsMerchants();
                break;
            case "company.merchant.settlement":
                maps = companyResponse.companyMerchantSettlement();
                break;
            case "company.request.deactivate":
                maps = companyResponse.companyRequestDeactivate();
                break;
            case "company.request.activate":
                maps = companyResponse.companyRequestAcctivate();
                break;
            case "company.request.close":
                maps = companyResponse.companyRequestClose();
                break;
            case "company.member.register":
                maps = companyResponse.companyMemberRegister();
                break;
            case "company.accounts.members":
                maps = companyResponse.companyAccountsMember();
                break;
            case "company.banks.account":
                maps = companyResponse.companyBanksAccount();
                break;
            case "company.banks.code":
                maps = companyResponse.companyBanksCode();
                break;
            case "company.banks.regencies":
                maps = companyResponse.companyBanksRegencies();
                break;
            case "company.banks.province":
                maps = companyResponse.companyBanksProvice();
                break;
            case "company.banks.register":
                companyBanksAccountRepository.save(new CompanyBanksAccountModel(bank_code, account_number, account_name, relationship, regency_code, province_code, id_number, address));
                maps = companyResponse.companyBanksRegister();
                break;
            case "company.services":
                maps = companyResponse.companyServices();
                break;
            case "company.transactions.inquiry":
                maps = companyResponse.companyTransactionsInquiry();

                String outputJson = "";
                try{
                    String url = "https://amanahku-heroku-demo.herokuapp.com/mynt/company";

                    URL obj = new URL(url);
                    HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
                    conn.setRequestProperty("Content-Type", "application/json");
                    conn.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiaW5hcnkiLCJleHAiOjE1ODIyOTg5ODQsImlhdCI6MTU4MjI4MDk4NH0.TiWb21s5Xko2ZbPFPHcDJ9Z7QTk28oCOY1z8DuOG-X3fF-3kE6xwXqjqvlw3SrI_3kIagtwgvyLPZa9jBLHMdA");
//                    conn.setRequestProperty("Accept", "application/json");
                    conn.setDoOutput(true);
                    conn.setRequestMethod("POST");

                    String data = "{\n" +
                            "  \"function\" : \"company.banks.register\"\n" +
                            "}";

                    OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
                    out.write(data);

                    out.close();
                    outputJson = convertStreamToString(conn.getInputStream());

                    System.out.print("==== OUTPUT JSON ==== \n"+outputJson);

//                    try {
//                        final JSONObject jsonObject = new JSONObject(outputJson);
//                        final JSONObject jsonArray = jsonObject.getJSONObject("data");
//
//                        long Response_amount = jsonArray.getLong("amount");
//                        String Response_account_number = jsonArray.getString("account_number");
//                        String Response_bank_code = jsonArray.getString("bank_code");
//                        String Response_trace_id = jsonArray.getString("trace_id");
//                        String Response_inquiry_id = jsonArray.getString("inquiry_id");
//                        String Response_service_name = jsonArray.getString("service_name");
//                        String Response_account_name = jsonArray.getString("account_name");
//                        String Response_bank_name = jsonArray.getString("bank_name");
//                        String Response_service_code = jsonArray.getString("service_code");
//                        String Response_inquired_at = jsonArray.getString("inquired_at");
//
//                        System.out.println("=== JSON ARRAY === \n"+
//                                            "amount = "+Response_amount+
//                                            "account_number = "+Response_account_number+
//                                            "bank_code = "+Response_bank_code+
//                                            "trace_id = "+Response_trace_id+
//                                            "inquiry_id = "+Response_inquiry_id+
//                                            "service_name = "+Response_service_name+
//                                            "account_name = "+Response_account_name+
//                                            "bank_name = "+Response_bank_name+
//                                            "service_code = "+Response_service_code+
//                                            "inquired_at = "+Response_inquired_at+
//                                "");
//
//
////                        inquiryMPRepository.save(new InquiryMP(Response_tr_id, Response_code, Response_hp, Response_tr_name,
////                                Response_period, Response_nominal, Response_admin, Response_ref_id, Response_selling_price));
//
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

                break;
            case "company.transactions.commit":
                maps = companyResponse.companyTransactionsCommit();
                break;
            case "company.accounts.recipients":
                maps = companyResponse.companyAccountsRecipients();
                break;
            case "company.transactions.reversal":
                maps = companyResponse.companyTransactionsReversal();
                break;
            case "company.transactions.status":
                maps = companyResponse.companyTransactionsStatus();
                break;
            case "company.transactions.history.success":
                maps = companyResponse.companyLTransactionsHistorySuccess();
                break;
            case "company.transactions.history.progress":
                maps = companyResponse.companyTransactionsHistoryProgress();
                break;
        }

        return maps;

    }

}
