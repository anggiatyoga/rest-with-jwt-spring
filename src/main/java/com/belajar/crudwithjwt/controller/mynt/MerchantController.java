package com.belajar.crudwithjwt.controller.mynt;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MerchantController {

    MerchantResponse merchantResponse = new MerchantResponse();

    @PostMapping("mynt/merchant")
    public Map<String, Object> login(@RequestParam Map<String, String> body) {

        String function = body.get("function");
        String username = body.get("username");
        String password = body.get("password");
        String token = body.get("token");

        Map<String, Object> maps = new HashMap<>();

        switch (function) {
            case "company.merchant.login":
                maps = merchantResponse.companyMerchantLogin();
                break;
            case "company.merchant.login.otp":
                maps = merchantResponse.companyMerchantLoginOtp();
                break;
            case "company.merchant.logout":
                maps = merchantResponse.companyMerchantLogout();
                break;
            case "company.merchant.profiles":
                maps = merchantResponse.companyMerchantProfile();
                break;
            case "company.merchant.logs.access":
                maps = merchantResponse.companyMerchantLogsAccess();
                break;
            case "company.merchant.logs.notifications":
                maps = merchantResponse.companyMerchantLogsNotifications();
                break;
            case "company.merchant.profiles.update.identity":
                maps = merchantResponse.companyMerchantProfilesUpdateIdentity();
                break;
            case "company.merchant.profiles.update.avatar":
                maps = merchantResponse.companyMerchantProfilesUpdateAvatar();
                break;
            case "company.merchant.profiles.update.credential":
                maps = merchantResponse.companyMerchantProfilesUpdateCredential();
                break;
            case "company.merchant.profiles.check.phone":
                maps = merchantResponse.companyMerchantProfilesCheckPhone();
                break;
            case "company.merchant.profiles.update.phone":
                maps = merchantResponse.companyMerchantProfilesUpdatePhone();
                break;
            case "company.merchant.pin.change":
                maps = merchantResponse.companyMerchantPinChange();
                break;
            case "company.merchant.password.forgot.request":
                maps = merchantResponse.companyMerchantPasswordForgotRequest();
                break;
            case "company.merchant.password.forgot.change":
                maps = merchantResponse.companyMerchantPasswordForgotChange();
                break;
            case "company.merchant.banks.account"://mynt to mynt & mynt to bank
                maps = merchantResponse.companyMerchantBanksAccount();
                break;
            case "company.merchant.banks.code":
                maps = merchantResponse.companyMerchantBanksCode();
                break;
            case "company.merchant.banks.regencies":
                maps = merchantResponse.companyMerchantBanksRegencies();
                break;
            case "company.merchant.banks.province" :
                maps = merchantResponse.companyMerchantBanksProvice();
                break;
            case "company.merchant.banks.register":
                maps = merchantResponse.companyMerchantBanksRegister();
                break;
            case "company.merchant.services": //mynt to mynt & mynt to bank & payment & payment & list penerima transaksi
                maps = merchantResponse.companyMerchantServices();
                break;
            case "company.merchant.transactions.inquiry"://mynt to mynt & mynt to bank & payment
                maps = merchantResponse.companyMerchantTransactionInquiry();
                break;
            case "company.merchant.transactions.commit"://mynt to mynt & mynt to bank & payment
                maps = merchantResponse.companyMerchantTransactionsCommit();
                break;
            case "company.merchant.transactions.status":
                maps = merchantResponse.companyMerchantTransactionsStatus();
                break;
            case "company.merchant.token.validate":
                maps = merchantResponse.companyMerchantTokenValidate();
                break;
            case "company.merchant.accounts.recipients":
                maps = merchantResponse.companyMerchantAccountsRecipients();
                break;
            case "company.merchant.transactions.reversal":
                maps = merchantResponse.companyMerchantTransactionsReversal();
                break;
            case "company.merchant.transactions.history.success":
                maps = merchantResponse.companyMerchantTransactionsSuccess();
                break;
            case "company.merchant.transactions.history.progress":
                maps = merchantResponse.companyMerchantTransactionsHistoryProgress();
                break;
            default:
                maps.put("status", "eror");
                maps.put("code", "400");
                maps.put("data", null);
                break;

        }

    return maps;

    }
}
