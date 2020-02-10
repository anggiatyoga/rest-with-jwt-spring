package com.belajar.crudwithjwt.controller.mynt;

import java.util.HashMap;
import java.util.Map;

public class MerchantResponse {
    public Map<String, Object> companyMerchantLogin() {

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

    public Map<String, Object> companyMerchantLoginOtp() {

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

    public Map<String, Object> companyMerchantLogout() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "Logout success");

        return map;

    }

    public Map<String, Object> companyMerchantProfile() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("account_number","000170000006");
                put("account_name","Merchant 1");
                put("referral_code","000");
                put("referral_name","PT. Artajasa Pembayaran Elektronis");
                put("referral_phone","628139293839");
                put("referral_email","info@artajasa.co.id");
                put("member_type","DEFAULT");
                put("mynt_id","Merchant1");
                put("last_balance","1000000");
                put("limit_balance","1000000");
                put("limit_transactions","50000000");
                put("total_transactions","200000");
                put("phone","622129706789");
                put("email","alpha.store@gmail.com");
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

    public Map<String, Object> companyMerchantLogsAccess() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>() {
            {
                put("ip_address","10.100.10.200");
                put("logged_at","2017-08-17 10:00:00");
            };
            {};
        });

        return map;

    }


    public Map<String, Object> companyMerchantLogsNotifications() {

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

    public Map<String, Object> companyMerchantProfilesUpdateIdentity() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;

    }

    public Map<String, Object> companyMerchantProfilesUpdateAvatar() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;

    }

    public Map<String, Object> companyMerchantProfilesUpdateCredential() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;

    }

    public Map<String, Object> companyMerchantProfilesCheckPhone() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;

    }

    public Map<String, Object> companyMerchantProfilesUpdatePhone() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;

    }

    public Map<String, Object> companyMerchantPinChange() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;

    }

    public Map<String, Object> companyMerchantPasswordForgotRequest() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;

    }

    public Map<String, Object> companyMerchantPasswordForgotChange() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;

    }

    public Map<String, Object> companyMerchantBanksAccount() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("status","active");
                put("bank_id","1");
                put("bank_code","688");
                put("bank_name","bpr ks");
                put("account_number","001001001");
                put("account_name","ben doe");
                put("registered_at","2017-08-17 16:00:00");
            };
            {};
        });

        return map;

    }

    public Map<String, Object> companyMerchantBanksCode() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("bank_code","688");
                put("bank_name","bpr ks");
            };
            {};
        });

        return map;

    }

    public Map<String, Object> companyMerchantBanksRegencies() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("regency_code","TNA");
                put("regency_name","kota adm. jakarta pusat");
            };
            {};
        });

        return map;

    }

    public Map<String, Object> companyMerchantBanksProvice() {

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
            {};
        });

        return map;

    }

    public Map<String, Object> companyMerchantBanksRegister() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;

    }

    public Map<String, Object> companyMerchantServices() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("service_code","001");
                put("service_name","transfer mynt to mynt");
            };
            {
                put("service_code","002");
                put("service_name","transfer mynt to bank");
            };
        });

        return map;

    }

    public Map<String, Object> companyMerchantTransactionInquiry() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "inquiry transfer mynt to mynt success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("inquiry_id","1111222233330001");
                put("reference_code","83787usdhi");
                put("trace_id","1234567890001");
                put("service_code","001");
                put("service_name","transfer mynt to mynt");
                put("account_number","000170000001");
                put("account_name","john doe");
                put("bank_code",null);
                put("bank_name",null);
                put("amount",500000);
                put("inquired_at","2017-08-17 20:00:00");
            };
            {};
        });

        return map;

    }

    public Map<String, Object> companyMerchantTransactionsCommit() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "inquiry transfer mynt to mynt success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("commit_id","1111222233330001");
                put("inquiry_id","1234567890001");
                put("reference_code","83787usdhi");
                put("trace_id","1234567890002");
                put("service_code","001");
                put("service_name","transfer mynt to mynt");
                put("account_number","000170000001");
                put("account_name","john doe");
                put("bank_code",null);
                put("bank_name",null);
                put("amount",50000);
                put("inquired_at","2017-08-17 20:01:0");
                put("committed_at","2017-08-17 20:01:0");
            };
            {};
        });

        return map;

    }

    public Map<String, Object> companyMerchantTransactionsStatus() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("status","commited");
                put("inquiry_id","1111222233330001");
                put("commit_id","4444555566660001");
                put("reference_code ","jdhsjh28129");
                put("reversal_id",null);
                put("inquiry_trace_id","123456789abcdefghi0001");
                put("commit_trace_id","123456789abcdefghi0002");
                put("reversal_trace_id",null);
                put("trace_id","1234567890005");
                put("service_code","001");
                put("service_name","transfer mynt to mynt");
                put("account_number","000170000001");
                put("account_name","john doe");
                put("bank_code",null);
                put("bank_name",null);
                put("amount",500000);
                put("inquired_at","2017-08-17 20:30:0");
                put("committed_a","2017-08-17 20:30:0");
                put("reversed_at",null);
                put("requested_at","2017-08-17 20:30:0");
            };
            {};
        });

        return map;

    }

    public Map<String, Object> companyMerchantTokenValidate() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("commit_id","4444555566660001");
                put("reference_code ","jdhsjh28129");
                put("inquiry_id","1111222233330001");
                put("trace_id","123456789abcdefghi0002");
                put("service_code","003");
                put("service_name","purchase");
                put("account_number","000170000001");
                put("account_name","john doe");
                put("bank_code",null);
                put("bank_name",null);
                put("amount",20000);
                put("inquired_at","2017-08-17 20:30:0");
                put("committed_a","2017-08-17 20:30:0");
            };
            {};
        });

        return map;

    }

    public Map<String, Object> companyMerchantAccountsRecipients() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("account_number","000170000001");
                put("account_name","john doe");
                put("bank_code",null);
                put("bank_name",null);
            };
            {};
        });

        return map;

    }

    public Map<String, Object> companyMerchantTransactionsReversal() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "inquiry transfer mynt to mynt success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("reversal_id","9999888877770001");
                put("inquiry_id","1111222233330001");
                put("commit_id","827329202003933");
                put("trace_id","1234567890006");
                put("service_code","001");
                put("service_name","transfer mynt to mynt");
                put("account_number","000170000001");
                put("account_name","john doe");
                put("bank_code",null);
                put("bank_name",null);
                put("amount",500000);
                put("inquired_at","2017-08-17 20:01:00");
                put("committed_at","2017-08-17 20:12:00");
                put("reversed_at","2017-08-17 20:30:00");
            };
            {};
        });

        return map;

    }

    public Map<String, Object> companyMerchantTransactionsSuccess() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("page",1);
                put("page_total",1);
                put("transactions",new HashMap<String, Object>(){
                    {
                        put("transaction_id","4444555566660001");
                        put("transaction_name","transfer mynt to mynt");
                        put("related_account_number","000170000001");
                        put("related_account_name","john doe");
                        put("debit",500000);
                        put("credit",0);
                        put("balance",9500000);
                        put("transaction_time","2017-08-17 20:01:00");
                    }
                });
            };
            {};
        });

        return map;
    }

    public Map<String, Object> companyMerchantTransactionsHistoryProgress() {

        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("page", "1");
                put("page_total","1");
                put("transactions", new HashMap<String, Object>(){
                    {
                        put("status", "pending");
                        put("transaction_id","1111222233330002");
                        put("transaction_name", "transfer mynt to bank");
                        put("related_account_number","001001001");
                        put("related_account_name", "ben doe");
                        put("amount",500000);
                        put("transaction_time", "2017-08-17 21:00:00");
                    };
                    {};
                });
            };
        });

        return map;

    }
}
