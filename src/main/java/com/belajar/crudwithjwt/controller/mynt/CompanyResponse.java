package com.belajar.crudwithjwt.controller.mynt;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

public class CompanyResponse {

    public static String convertStreamToString(InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

    Map<String, Object> companyLogin(){

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

    Map<String, Object> companyLoginOtp(){

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

    Map<String, Object> companyProfiles(){

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

    Map<String, Object> companyLogAccess(){

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

    Map<String, Object> companyLogNotifications(){

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

    public Map<String, Object> companyProfilesUpdateIdentity() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyProfilesUpdateAvatar() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyProfilesUpdateCredential() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyProfilesCheckPhone() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyProfilesUpdatePhone() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyPinChange() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyPinForgot() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyPasswordForgotRequest() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyPasswordForgotChange() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyMerchantSettlementSchedule() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyMerchantSettlement() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyRequestDeactivate() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyRequestAcctivate() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyRequestClose() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyMemberRegister() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyMerchantTypes() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("code","5b5af3d0-9c5a-11e8-a274-19fcdc62d9b8");
                put("name","DEFAULT");
                put("deposit",20000);
                put("limit_balance",2000000);
                put("limit_transaction",20000000);
                put("services", new HashMap<String, Object>(){
                    {
                        put("code","006");
                        put("name","TRANSFER MYNT TO MYNT");
                    };
                    {
                        put("code","006");
                        put("name","TRANSFER MYNT TO MYNT");
                    };

                });
                put("document_types",new HashMap<String, Object>(){
                    {
                        put("code",001);
                        put("name","PASSBOOK");
                    }
                });
            }
        });

        return map;

    }

    public Map<String, Object> companyMerchantRegister() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "registration success");

        return map;
    }

    public Map<String, Object> companyAccountsMerchants() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("account_number","000170000003");
                put("account_name","alpha store");
                put("phone","6285812345678");
                put("email","alpha.store@gmail.com");
                put("deposit","100000");
                put("last_balance","20000000");
                put("ettlement_schedule", new HashMap<String, Object>(){
                    {
                        put("00:00","18:00");
                    }
                });
                put("registed_at","2017-08-17 16:00:00");
            };
            {
                put("account_number","000170000003");
                put("account_name","beta store");
                put("phone","6285812345678");
                put("email","beta.store@gmail.com");
                put("deposit","100000");
                put("last_balance","20000000");
                put("ettlement_schedule", new HashMap<String, Object>(){
                    {
                        put("00:00","18:00");
                    }
                });
                put("registed_at","2017-08-17 16:00:00");
            };
        });

        return map;
    }

    public Map<String, Object> companyAccountsMember() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("account_type","registered");
                put("account_number","000170000001");
                put("account_name","john doe");
                put("phone","6281212345678");
                put("email","john.doe@gmail.com");
                put("registered_at","2017-08-17 13:30:40");
            };
            {
                put("account_type","unregistered");
                put("account_number","000170000001");
                put("account_name","jane doe");
                put("phone","6281212345678");
                put("email","john.doe@gmail.com");
                put("registered_at","2017-08-17 14:20:00");
            };
            {};
        });
        return map;
    }

    public Map<String, Object> companyBanksAccount() {
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

    public Map<String, Object> companyBanksCode() {
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

    public Map<String, Object> companyBanksRegencies() {
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

    public Map<String, Object> companyBanksProvice() {
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

    public Map<String, Object> companyBanksRegister() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");

        return map;
    }

    public Map<String, Object> companyServices() {
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

    public Map<String, Object> companyTransactionsInquiry() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "inquiry transfer mynt to mynt success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("inquiry_id","1111222233330001");
                put("trace_id","1234567890001");
                put("service_code","001");
                put("service_name","transfer mynt to myn");
                put("account_number","000170000001");
                put("account_name","john do");
                put("bank_code",null);
                put("bank_name",null);
                put("amount",500000);
                put("inquired_at","2017-08-17 20:00:00");
            };
            {};
        });

        return map;
    }

    public Map<String, Object> companyTransactionsCommit() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "inquiry transfer mynt to mynt success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("commit_id","1111222233330001");
                put("inquiry_id","1234567890001");
                put("trace_id","001");
                put("service_code","transfer mynt to mynt");
                put("service_name","000170000001");
                put("account_number","john do");
                put("account_name",null);
                put("bank_code",null);
                put("bank_name",500000);
                put("amount","2017-08-17 20:00:00");
                put("inquired_at","2017-08-17 20:01:0");
                put("committed_at","2017-08-17 20:01:0");
            };
            {};
        });

        return map;
    }

    public Map<String, Object> companyAccountsRecipients() {
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

    public Map<String, Object> companyTransactionsReversal() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "inquiry transfer mynt to mynt success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("reversal_id","9999888877770001");
                put("inquiry_id","1111222233330001");
                put("commit_id","827329202003933");
                put("trace_id","123456789abcdefghi0006");
                put("service_code","001");
                put("service_name","transfer mynt to myn");
                put("account_number","000170000001");
                put("account_name","john doe");
                put("bank_code",null);
                put("bank_name",null);
                put("amount",500000);
                put("inquired_at","2017-08-17 20:01:0");
                put("committed_at","2017-08-17 20:12:0");
                put("reversed_at","2017-08-17 20:30:0");
            };
            {};
        });

        return map;
    }

    public Map<String, Object> companyTransactionsStatus() {
        Map<String, Object> map = new HashMap<>();

        map.put("status",true);
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", new HashMap<String, Object>(){
            {
                put("status","9999888877770001");
                put("inquiry_id","1111222233330001");
                put("commit_id","827329202003933");
                put("reversal_id",null);
                put("inquiry_trace_id","123456789abcdefghi0001");
                put("commit_trace_id","123456789abcdefghi0002");
                put("reversal_trace_id",null);
                put("trace_id","23456789abcdefghi0005");
                put("service_code","001");
                put("service_name","transfer mynt to mynt");
                put("account_number","000170000001");
                put("account_name","john doe");
                put("bank_code",null);
                put("bank_name",null);
                put("amount",500000);
                put("charge",2000);
                put("inquired_at","2017-08-17 20:30:0");
                put("committed_a","2017-08-17 20:30:0");
                put("reversed_at",null);
                put("requested_at","2017-08-17 20:30:0");
            };
            {};
        });

        return map;
    }

    public Map<String, Object> companyLTransactionsHistorySuccess() {
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

    public Map<String, Object> companyTransactionsHistoryProgress() {
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
                        put("status","pending");
                        put("transaction_id", "1111222233330002");
                        put("transaction_name","transfer mynt to bank");
                        put("related_account_number","001001001");
                        put("related_account_name","ben doe");
                        put("amount",500000);
                        put("transaction_time","2017-08-17 21:00:00");
                    }
                });
            };
            {};
        });

        return map;
    }
}
