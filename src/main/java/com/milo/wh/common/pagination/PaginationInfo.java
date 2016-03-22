package com.milo.wh.common.pagination;

import com.milo.wh.common.base.BaseVO;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by marco on 2016-03-22.
 * @author marco
 */
public class PaginationInfo {

    @Getter
    @Setter
    private int currentPageNo;

    @Getter
    @Setter
    private int recordCountPerPage;

    @Getter
    @Setter
    private int pageSize;

    @Getter
    @Setter
    private int totalRecordCount;

    private int totalPageCount;
    private int firstPageNoOnPageList;
    private int lastPageNoOnPageList;
    private int firstRecordIndex;
    private int lastRecordIndex;

    @Setter
    private int listNum;

    @Getter
    @Setter
    private String index_name;


    public int getTotalPageCount() {
        totalPageCount = ((getTotalRecordCount()-1)/getRecordCountPerPage()) + 1;
        return totalPageCount;
    }

    public int getFirstPageNo(){
        return 1;
    }

    public int getLastPageNo(){
        return getTotalPageCount();
    }

    public int getFirstPageNoOnPageList() {
        firstPageNoOnPageList = ((getCurrentPageNo()-1)/getPageSize())*getPageSize() + 1;
        return firstPageNoOnPageList;
    }

    public int getLastPageNoOnPageList() {
        lastPageNoOnPageList = getFirstPageNoOnPageList() + getPageSize() - 1;
        if(lastPageNoOnPageList > getTotalPageCount()){
            lastPageNoOnPageList = getTotalPageCount();
        }
        return lastPageNoOnPageList;
    }

    public int getFirstRecordIndex() {
        firstRecordIndex = (getCurrentPageNo() - 1) * getRecordCountPerPage();
        return firstRecordIndex;
    }

    public int getLastRecordIndex() {
        lastRecordIndex = getCurrentPageNo() * getRecordCountPerPage();
        return lastRecordIndex;
    }
    public int getListNum() {
        listNum = getTotalRecordCount() - (getCurrentPageNo() - 1) * getRecordCountPerPage();
        return listNum;
    }

    public PaginationInfo(BaseVO baseVo, int cnt){
        setCurrentPageNo(baseVo.getPage());
        setPageSize(baseVo.getPageSize());
        setRecordCountPerPage(baseVo.getRecordSize());
        setTotalRecordCount(cnt);
    }
}
