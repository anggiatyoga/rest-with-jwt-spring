package com.belajar.crudwithjwt.controller.mynt;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


public class MemberResponse {

    Map<String, Object> companyMemberLogin(){

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "login success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjBhN");
            }
        });

        return map;
    }

    Map<String, Object> companyMemberLoginOtp(){

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "Logout success");

        return map;
    }

    Map<String, Object> companyLogout(){

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "Logout success");

        return map;
    }

    Map<String, Object> companyMemberProfile(){

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("account_number","000170000006");
                put("account_name","Joko");
                put("referral_code","000");
                put("referral_name","PT. Artajasa Pembayaran Elektronis");
                put("referral_phone","628139293839");
                put("referral_email","nfo@artajasa.co.id");
                put("member_type","DEFAULT");
                put("member_status” ","UNREGISTERED");
                put("mynt_id","Joko123");
                put("last_balance","1000000");
                put("limit_balance","2000000");
                put("limit_transactions","20000000");
                put("total_transactions","200000");
                put("avatar","http://172.100.100.202/mynt/img/member/member.jpg");
                put("phone","622129706789");
                put("email","lpha.store@gmail.com");
                put("address","Jakarta Selatan");
                put("country_code","null");
                put("country_name","null");
                put("birth_date","null");
                put("birth_place","null");
                put("occupation","null");
                put("citizenship","null");
                put("id_number","null");
                put("fund_resource","null");
                put("reject_reason","null");
                put("registered_at","2017-01-01 00:00:00");
                put("last_updated_at","2017-08-01 00:00:00");
            }
        });

        return map;
    }

    Map<String, Object> companyMemberLogsAccess(){

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>() {
            {
                put("ip_address","10.100.10.200");
            }
        });

        return map;
    }

    Map<String, Object> companyMemberLogsNotifications(){

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>() {
            {
                put("title","transaction success");
                put("message","your transaction #17210931 is complete");
                put("notified_at","2017-08-17 12:00:00");
            };
            {};
        });

        return map;
    }

    Map<String, Object> companyMemberBanksRegencies(){

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("regency_code","TNA");
                put("regency_name","kota adm.jakarta pusat");
            };
            {}
        });

        return map;
    }

    Map<String, Object> companyMemberBanksProvince(){

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("id",1);
                put("name","Jawa Barat");
                put("code","100");
                put("created_at","2018-08-09 12:00:52");
                put("updated_at","2018-08-09 12:00:52");
            };
            {}
        });

        return map;
    }

    Map<String, Object> companyMemberUpgrade(){
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("regency_code","TNA");
                put("regency_name","kota adm.jakarta pusat");
            };
            {}
        });

        return map;
    }

    Map<String, Object> companyMemberProfilesUpdateIdentity(){
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    Map<String, Object> companyMemberProfilesUpdateAvatar(){
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    //Edit password login
    Map<String, Object> companyMemberProfilesUpdateCredential(){
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    //Edit Nomor Telepon
    Map<String, Object> companyMemberProfilesUpdatePhone(){
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }


    Map<String, Object> companyMemberProfilesCheckPhone() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }


    Map<String, Object> companyMemberPinChange() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    Map<String, Object> companyMemberPasswordForgotRequest() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }


    Map<String, Object> companyMemberPasswordForgotChange() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }


    Map<String, Object> companyMemberBanksCode() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, String>(){
            {
                put("bank_code","688");
                put("bank_name","bpr ks");
            };
            {}
        });

        return map;
    }

    public Map<String, Object> companyMemberBanksRegister() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyMemberBanksAccount() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, String>(){
            {
                put("status","active");
                put("bank_id","1");
                put("bank_code","688");
                put("bank_name","bpr ks");
                put("account_number","001001001");
                put("account_name","ben doe");
                put("registered_at","2017-08-17 16:00:00");
            };
            {}
        });

        return map;
    }

    public Map<String, Object> companyMemberServices() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data",new HashMap<String, String>(){
            {
                put("service_code","001");
                put("service_name","transfer mynt to mynt");
            };
            {
                put("service_code","002");
                put("service_name","transfer mynt to bank");
            };
            {};
        });
        return map;
    }

    public Map<String, Object> companyMemberTransactionsInquiry() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "inquiry transfer mynt to mynt success");
        map.put("data", new HashMap<String, String>(){
            {
                put("inquiry_id", "1111222233330001");
                put("reference_code","83787usdhi");
                put("trace_id","1234567890001");
                put("service_code","001");
                put("service_name","transfer mynt to mynt");
                put("account_number","000170000001");
                put("account_name","john doe");
                put("bank_code",null);
                put("bank_name",null);
                put("amount","500000");
                put("inquired_at","2017-08-17 20:00:00");
            };
        });

        return map;
    }

    public Map<String, Object> companyMemberTransactionsCommit() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, String>(){
            {
                put("commit_id", "4444555566660001");
                put("inquiry_id","1111222233330002");
                put("reference_code","83787usdhi");
                put("trace_id","1234567890002");
                put("service_code","001");
                put("service_name","transfer mynt to mynt");
                put("account_number","000170000001");
                put("account_name","john doe");
                put("bank_code",null);
                put("bank_name",null);
                put("amount","500000");
                put("inquired_at","2017-08-17 20:00:00");
                put("committed_at","2017-08-17 20:01:00");
            };
        });
        return map;
    }

    public Map<String, Object> companyMemberTokenGenerate() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, String>(){
            {
                put("token_trx", "918234");
                put("expired_at","2019-12-31 12:09:08");
            };
        });
        return map;

    }

    public Map<String, Object> companyMemberAccountsReceipents() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, String>(){
            {
                put("account_number", "000170000001");
                put("account_name","john doe");
                put("bank_code", null);
                put("bank_name",null);
            };
            {};
        });
        return map;
    }

    public Map<String, Object> companyMemberTransactionsStatus() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, String>(){
            {
                put("status", "1111222233330001");
                put("inquiry_id","83787usdhi");
                put("commit_id","1234567890001");
                put("reversal_id",null);
                put("inquiry_trace_id","123456789abcdefghi0001");
                put("commit_trace_id","123456789abcdefghi0002");
                put("reversal_trace_id",null);
                put("trace_id","123456789abcdefghi0005");
                put("service_code","001");
                put("service_name","transfer mynt to mynt");
                put("account_number","000170000001");
                put("account_name","john doe");
                put("bank_code",null);
                put("bank_name",null);
                put("amount","500000");
                put("inquired_at","2017-08-17 20:00:00");
                put("committed_at","2017-08-17 20:01:00");
                put("reversed_at",null);
                put("requested_at","2017-08-17 20:30:00");
            };
        });

        return map;
    }

    public Map<String, Object> companyMemberTransactionsHistoryStatus() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("status", "1111222233330001");
                put("inquiry_id","83787usdhi");
                put("commit_id", new HashMap<String, String>(){
                    {
                        put("transaction_id", "4444555566660001");
                        put("transaction_name","transfer mynt to myn");
                        put("related_account_number", "000170000001");
                        put("related_account_nam","john doe");
                        put("debit", "500000");
                        put("credit","0");
                        put("balance", "9500000");
                        put("transaction_time","2017-08-17 20:01:00");
                    }
                });
            };
        });

        return map;
    }

    public Map<String, Object> companyMemberTransactionsHistoryProgres() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("page", "1");
                put("page_total","1");
                put("transactions", new HashMap<String, String>(){
                    {
                        put("status", "pending");
                        put("transaction_id","1111222233330002");
                        put("transaction_name", "transfer mynt to bank");
                        put("related_account_number","001001001");
                        put("related_account_name", "ben doe");
                        put("amount","500000");
                        put("transaction_time", "2017-08-17 21:00:00");
                    };
                    {};
                });
            };
        });

        return map;
    }
}
