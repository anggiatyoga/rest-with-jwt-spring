package com.belajar.crudwithjwt.controller.mynt;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MemberController {

    MemberResponse memberResponse = new MemberResponse();
//    CompanyResponse companyResponse = new CompanyResponse();

    @PostMapping("/mynt/member")
    public Map<String, Object> login(@RequestParam Map<String, String> body) {
//        String test = body.get("key");
        String function = body.get("function");
        String username = body.get("username");
        String password = body.get("password");
        String token = body.get("token");

        Map<String, Object> maps = new HashMap<>();

        switch (function) {
            case "company.member.login":
                maps = memberResponse.companyMemberLogin();
                break;
            case "company.member.login.otp":
                maps = memberResponse.companyMemberLoginOtp();
                break;
            case "company.logout":
                maps = memberResponse.companyLogout();
                break;
            case "company.member.profiles":
                maps = memberResponse.companyMemberProfile();
                break;
            case "company.member.logs.access":
                maps = memberResponse.companyMemberLogsAccess();
                break;
            case "company.member.logs.notifications":
                maps = memberResponse.companyMemberLogsNotifications();
                break;
            case "company.member.banks.regencies":
                maps = memberResponse.companyMemberBanksRegencies();
                break;
            case "company.member.banks.province" :
                maps = memberResponse.companyMemberBanksProvince();
                break;
            case "company.member.upgrade":
                maps = memberResponse.companyMemberUpgrade();
                break;
            case "company.member.profiles.update.identity":
                maps = memberResponse.companyMemberProfilesUpdateIdentity();
                break;
            case "company.member.profiles.update.avatar":
                maps = memberResponse.companyMemberProfilesUpdateAvatar();
                break;
            case "company.member.profiles.update.credential":
                maps = memberResponse.companyMemberProfilesUpdateCredential();
                break;
            case "company.member.profiles.check.phone":
                maps = memberResponse.companyMemberProfilesCheckPhone();
                break;
            case "company.member.profiles.update.phone":
                maps = memberResponse.companyMemberProfilesUpdatePhone();
                break;
            case "company.member.pin.change":
                maps = memberResponse.companyMemberPinChange();
                break;
            case "company.member.password.forgot.request":
                maps = memberResponse.companyMemberPasswordForgotRequest();
                break;
            case "company.member.password.forgot.change":
                maps = memberResponse.companyMemberPasswordForgotChange();
                break;
            case "company.member.banks.code":
                maps = memberResponse.companyMemberBanksCode();
                break;
            case "company.member.banks.register":
                maps = memberResponse.companyMemberBanksRegister();
                break;
            case "company.member.banks.account"://mynt to mynt & mynt to bank
                maps = memberResponse.companyMemberBanksAccount();
                break;
            case "company.member.services": //mynt to mynt & mynt to bank & payment & payment & list penerima transaksi
                maps = memberResponse.companyMemberServices();
                break;
            case "company.member.transactions.inquiry"://mynt to mynt & mynt to bank & payment
                maps = memberResponse.companyMemberTransactionsInquiry();
                break;
            case "company.member.transactions.commit"://mynt to mynt & mynt to bank & payment
                maps = memberResponse.companyMemberTransactionsCommit();
                break;
            case "company.member.token.generate":
                maps = memberResponse.companyMemberTokenGenerate();
                break;
            case "company.member.accounts.recipients":
                maps = memberResponse.companyMemberAccountsReceipents();
                break;
            case "company.member.transactions.status":
                maps = memberResponse.companyMemberTransactionsStatus();
                break;
            case "company.member.transactions.history.success":
                maps = memberResponse.companyMemberTransactionsHistoryStatus();
                break;
            case "company.member.transactions.history.progress":
                maps = memberResponse.companyMemberTransactionsHistoryProgres();
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
