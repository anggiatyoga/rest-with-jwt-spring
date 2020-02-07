package com.belajar.crudwithjwt.controller.mynt;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CompanyController {

    CompanyResponse companyResponse = new CompanyResponse();

    @PostMapping("/mynt/company")
    public Map<String, Object> login(@RequestParam Map<String, String> body) {
        String function = body.get("function");
        String username = body.get("username");
        String password = body.get("password");
        String token = body.get("token");

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
                maps = companyResponse.companyBanksRegister();
                break;
            case "company.services":
                maps = companyResponse.companyServices();
                break;
            case "company.transactions.inquiry":
                maps = companyResponse.companyTransactionsInquiry();
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
