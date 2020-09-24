# TWCulturalActivities-V0.9
  
這是main分支      
大家先按右上角fork，建立新的分支到自己帳號內，再clone帳號內的分支到本地電腦  
舊的ForkThisProject分支有Github使用說明，可依個人需求決定要不要刪除
  
  
第一步. ***import專案***  
   
1. 下載TWCulturalActivities-V0.9專案，並新增C:\Java\FinalProject資料夾，路徑統一，之後如果有輸入輸出的文件才不會找無
2. 用eclipse開一個新的workspace，路徑是上方的C:\Java\FinalProject，並調整偏好設定成自己習慣的
3. import exsisting projects "TWCulturalActivities-V0.9"，執行專案內Java Resources/src/package35_A內的Test1.class，會重新建立MAINTABLE和插入資料，這個版本的主表格有新增一個NO欄位
4. 執行專案內Java Resources/src/package35_A內的Test1.class，會建立有經緯度的LOCATIONTABLE，有興趣可以玩玩
5. MAINTABLE不需手動新增或修改，它的用途是把文化部的網路資料塞到資料庫，方便大家去查詢測試自己要做的功能
6. MAINTABLE欄位都是ACT_(活動)開頭，欄位詳細說明參見:https://cloud.culture.tw/frontsite/trans/SearchShowAction.do?method=doFindTypeJOpenApi&category=all
7. 如果要做的功能需要運算，可以select MAINTABLE欄位資料放到另一個新增的表格，e.g. LOCATIONTABLE
8. 最終SQL查詢資料的呈現如果會橫跨兩張表格的資料，可以用join的方式一次查兩張表
9. 在Servlet還沒研究透徹前，可以循第一次專案的DAO思考怎麼寫那些方法
10. 每個人寫的程式碼都開不同package放，e.g. package35_A，package35_B，package04_A
11. ＷebContent下的html網頁也要在檔名前方上座號，e.g. 35_XXX.html，03_XXX.html
12. 專案內有建好每個人的預設package，可以參考參考，號碼後面的XXX和A都是可以改的
13. 要進行第二步-撰寫servlet程式前，在workspace內新增server 
  
第二步. ***仿照上課內容寫好透過 Datasource 方式串接JDBC連線到資料庫的Servlet程式***  

1. 未完待續......回家再研究XD
  
  
