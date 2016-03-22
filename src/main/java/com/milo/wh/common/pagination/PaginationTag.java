package com.milo.wh.common.pagination;

import lombok.Getter;
import lombok.Setter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

/**
 * Created by marco on 2016-03-22.
 * @author marco
 */
public class PaginationTag extends TagSupport {

    @Getter
    @Setter
    private PaginationInfo paginationInfo;

    @Getter
    @Setter
    private String type;

    @Getter
    @Setter
    private String jsFunction;

    @Override
    public int doEndTag() throws JspException {

        try{

            JspWriter out = pageContext.getOut();
            PaginationRenderer paginationRenderer = new PaginationRenderer();
            paginationRenderer.setPaginationType(type);

            String contents = paginationRenderer.renderPagination(paginationInfo, jsFunction);

            out.println(contents);

            return EVAL_PAGE;
        } catch (IOException e){
            throw new JspException();
        }
    }
}
