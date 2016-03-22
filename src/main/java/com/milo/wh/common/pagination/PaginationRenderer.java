package com.milo.wh.common.pagination;

import java.text.MessageFormat;

/**
 * Created by marco on 2016-03-22.
 * @author marco
 */
public class PaginationRenderer {

    public String firstPageLabel;
    public String previousPageLabel;
    public String currentPageLabel;
    public String otherPageLabel;
    public String nextPageLabel;
    public String lastPageLabel;

    public PaginationRenderer(){
        firstPageLabel = "<span class=\"next_end_n4\"><a href=\"#\" onclick=\"{0}({1}); return false;\"><span class=\"prev_n1\">처음</span></a>&#160;</span>";
        previousPageLabel = "<span class=\"pre_n4\"><a href=\"#\" onclick=\"{0}({1}); return false;\"><span class=\"prev_n2\">이전</span></a></span>";
        currentPageLabel = "<a href=\"#\" onclick=\"return false;\"><span>{0}</span></a>";
        otherPageLabel = "<a href=\"#\" onclick=\"{0}({1}); return false;\"><span>{2}</span></a>";
        nextPageLabel = "<span class=\"next_n4\"><a href=\"#\" onclick=\"{0}({1}); return false;\"><span class=\"next_n2\">다음</span></a></span>";
        lastPageLabel = "<span class=\"next_end_n4\"><a href=\"#\" onclick=\"{0}({1}); return false;\"><span class=\"next_n1\">마지막</span></a>&#160;</span>";
    }

    public void setPaginationType(String type){
        if ("image".equals(type)){
            firstPageLabel = "<li class=\"img\"><a href=\"#\" onclick=\"{0}({1}); \"><img src=\"/images/btn/btn_first.gif\" alt=\"처음페이지\" /></a></li>";
            previousPageLabel = "<li class=\"img\"><a href=\"#\" onclick=\"{0}({1}); \"><img src=\"/images/btn/btn_prev.gif\" alt=\"이전페이지\" /></a></li>";
            currentPageLabel = "<li><strong>{0}</strong></li>";
            otherPageLabel = "<li><a href=\"#\" onclick=\"{0}({1}); \">{2}</a></li>";
            nextPageLabel = "<li class=\"img\"><a href=\"#\" onclick=\"{0}({1}); \"><img src=\"/images/btn/btn_next.gif\" alt=\"다음페이지\" /></a></li>";
            lastPageLabel = "<li class=\"img\"><a href=\"#\" onclick=\"{0}({1}); \"><img src=\"/images/btn/btn_last.gif\" alt=\"마지막페이지\" /></a></li>";
        }
    }

    public String renderPagination(PaginationInfo paginationInfo, String jsFunction){
        StringBuffer strBuff = new StringBuffer("<div class=\"pagenation\">");

        if (paginationInfo != null){

            int firstPageNo = paginationInfo.getFirstPageNo();
            int firstPageNoOnPageList = paginationInfo.getFirstPageNoOnPageList();
            int totalPageCount = paginationInfo.getTotalPageCount();
            int pageSize = paginationInfo.getPageSize();
            int lastPageNoOnPageList = paginationInfo.getLastPageNoOnPageList();
            int currentPageNo = paginationInfo.getCurrentPageNo();
            int lastPageNo = paginationInfo.getLastPageNo();

            if(totalPageCount > pageSize){
                if(firstPageNoOnPageList > pageSize){
                    strBuff.append(MessageFormat.format(firstPageLabel, new Object[]{jsFunction, Integer.toString(firstPageNo)}));
                    strBuff.append(MessageFormat.format(previousPageLabel,new Object[]{jsFunction,Integer.toString(firstPageNoOnPageList-1)}));
                }else{
                    strBuff.append(MessageFormat.format(firstPageLabel,new Object[]{jsFunction,Integer.toString(firstPageNo)}));
                    strBuff.append(MessageFormat.format(previousPageLabel,new Object[]{jsFunction,Integer.toString(firstPageNo)}));
                }
            }

            for(int i=firstPageNoOnPageList;i<=lastPageNoOnPageList;i++){
                if(i==currentPageNo){
                    strBuff.append(MessageFormat.format(currentPageLabel,new Object[]{Integer.toString(i)}));
                }else{
                    strBuff.append(MessageFormat.format(otherPageLabel,new Object[]{jsFunction,Integer.toString(i),Integer.toString(i)}));
                }
            }

            if(totalPageCount > pageSize){
                if(lastPageNoOnPageList < totalPageCount){
                    strBuff.append(MessageFormat.format(nextPageLabel,new Object[]{jsFunction,Integer.toString(firstPageNoOnPageList+pageSize)}));
                    strBuff.append(MessageFormat.format(lastPageLabel,new Object[]{jsFunction,Integer.toString(lastPageNo)}));
                }else{
                    strBuff.append(MessageFormat.format(nextPageLabel,new Object[]{jsFunction,Integer.toString(lastPageNo)}));
                    strBuff.append(MessageFormat.format(lastPageLabel,new Object[]{jsFunction,Integer.toString(lastPageNo)}));
                }
            }
        }
        strBuff.append("</div>");
        return strBuff.toString();
    }
}
