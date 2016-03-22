package com.milo.wh.common.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by marco on 2016-03-22.
 * @author marco
 */
public class BaseVO implements Serializable {


    transient int page = 1;

    @Getter
    @Setter
    transient int pageSize = 10;

    @Getter
    @Setter
    transient int recordSize = 10;

    @Getter
    @Setter
    transient String searchType = "";

    @Getter
    @Setter
    transient String searchText = "";

    @Getter
    @Setter
    transient String searchType1 = "";

    @Getter
    @Setter
    transient String searchText1 = "";

    @Getter
    @Setter
    transient String searchType2 = "";

    @Getter
    @Setter
    transient String searchText2 = "";

    @Getter
    @Setter
    transient String searchType3 = "";

    @Getter
    @Setter
    transient String searchText3 = "";

    @Getter
    @Setter
    transient String start_date = "";

    @Getter
    @Setter
    transient String end_date = "";

    @Getter
    @Setter
    transient int TOTALCNT = 0;

    public final int getPage() {
        return page;
    }

    public final void setPage(int page) {
        if(page <= 0)
            page = 1;
        this.page = page;
    }

    public int getFirstRecordIndex() {
        return ((getPage() - 1) * getRecordSize()) + 1;
    }

    public int getLastRecordIndex() {
        return getPage() * getRecordSize();
    }

}
