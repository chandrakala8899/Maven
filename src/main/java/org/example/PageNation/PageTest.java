package org.example.PageNation;

import java.util.List;

public class PageTest {


    public static void main(String[] args) {
        DataService dataService = new DataService();
        List<String> names = dataService.getNames();

        PagesNation pagesNation = new PagesNation();
        pagesNation.perPageRecordSize= 10;

        if( names.size() % 10>0){
            pagesNation.totalPages = names.size()/10+1;

        }else {
            pagesNation.totalPages = names.size()/10;
        }

        for(int i=0; i< pagesNation.totalPages;i++){
            int endIndex = (i* pagesNation.perPageRecordSize) + pagesNation.perPageRecordSize;

            if(endIndex>names.size()){
                endIndex = names.size();
            }

            List<String> stringList = names.subList(i* pagesNation.perPageRecordSize,endIndex);
            System.out.println("   : "  +i+  "  :" +stringList);

        }
    }
}
