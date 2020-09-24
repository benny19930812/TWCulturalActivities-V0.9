# TWCulturalActivities-V0.9
  
這是main分支~    
大家先按右上角fork，建立新的分支到自己帳號內，再clone帳號內的分支  
  
  
第一步. ***import專案***  
  
  
1. 下載jsontransfer專案，執行Test1.class，建立MAINTABLE和插入表格資料
2. MAINTABLE不需手動新增或修改，它的用途是把文化部的網路資料塞到資料庫，方便大家去查詢測試自己要做的功能
3. MAINTABLE欄位都是ACT_(活動)開頭，之後自己新增的表欄位名稱有重複(TITLE PRICE)到沒關係~。
4. 因為原始資料比較亂，所以只有category欄位資料型態是int，其他都是String；如果要做的功能需要運算，可以select MAINTABLE欄位資料放到另一個新增的表格，e.g. Latitude_Longitude、Price
5. 最終SQL查詢資料的呈現結果如果橫跨兩張表格的資料，可以用join的方式一次查兩張表
6. 在Servlet還沒研究透徹前，可以循第一次專案的DAO思考怎麼寫那些方法
7. 每個人寫的程式碼都開不同package放，e.g. package35，package+後綴詞座號，然後ＷebContent下的html網頁也要在檔名後加上座號，方便分辨檔案創造者
  
  
第二步. ***仿照上課內容寫好透過 Datasource 方式串接JDBC連線到資料庫的Servlet程式***  
  
  
