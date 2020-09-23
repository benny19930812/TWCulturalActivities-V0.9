# TWCulturalActivities-V0.9
這是main分支，大家不要clone到這個分支哦～  
先按右上角fork新的分支到自己帳號內，再去clone帳號內的分支  
  
  
***在V1.0主程式上傳前需要做的事***  
  
  
1. 小組成員登入sqlplus執行grant all privileges to group4 identified by oracle，創建帳號;  
2. 下載jsontransfer檔案，執行TestOnly.class，建立MAINTABLE和插入表格資料。
3. MAINTABLE未來不會再手動新增或修改，它的用途是把文化部的網路資料塞到資料庫，方便大家去查詢測試自己要做的功能。
4. 因為原始資料比較亂，所以只有category欄位資料型態是int，其他都是String；如果要做的功能需要運算，可以select MAINTABLE欄位資料放到另一個新增的表格，e.g. Latitude_Longitude、Price。
5. 最終SQL查詢資料的呈現結果如果橫跨兩張表格的資料，可以用join的方式一次查兩張表。
6. 在Servlet還沒研究透徹前，可以循第一次專案的方式先思考練習寫那些方法。
  
  
----------寫好透過 Datasource 方式串接JDBC連線到資料庫的Servlet程式，然後建個簡單表格做新增刪除的測試----------  
  
  
7. 測試ok後，上傳servlet連線JDBC的程式當V1.0的專案，大家可以下載參考研究一下怎麼去連線DB，然後開始寫分配到的功能  
8. 每個人寫的程式碼都開不同package放，e.g. package35，package後加座號，然後ＷebContent下的html網頁也要在檔名後打上座號，方便分辨檔案創造者  
