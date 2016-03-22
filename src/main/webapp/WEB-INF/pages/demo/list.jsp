<%--
  Created by IntelliJ IDEA.
  User: medialog
  Date: 2016-02-22
  Time: 오후 3:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    $(document).ready(function() {
        $('#datalist').DataTable({
            "language": {
                "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Korean.json"
            }
        });
    } );
</script>
<div class="content-wrapper">
    <section class="content-header">
        <h1>
            데이터 테이블
            <small>페이징 처리</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="#">Tables</a></li>
            <li class="active">Data tables</li>
        </ol>
    </section>

    <section class="content">
        <div class="row">
            <div class="col-xs-12">
                <div class="box">
                    <div class="box-header">
                        <h3 class="box-title">데이터 테이블</h3>
                    </div>

                    <div class="box-body">
                        <table id="datalist" class="table table-bordered table-hover">
                            <thead>
                            <tr>
                                <th>회원번호</th>
                                <th>아이디</th>
                                <th>회원명</th>
                                <th>등록일자</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:choose>
                                <c:when test="${not empty list}">
                                    <c:forEach var="c" items="${list}" varStatus="stat">
                                        <tr>
                                            <td><c:out value="${c.seq}" /></td>
                                            <td><c:out value="${c.userid}" />$data.userid</td>
                                            <td><c:out value="${c.name}" />$data.name</td>
                                            <td><c:out value="${c.regdate}" /></td>
                                        </tr>
                                    </c:forEach>
                                </c:when>
                                <c:otherwise>
                                    <tr>
                                        <td colspan="4">내용이 없습니다</td>
                                    </tr>
                                </c:otherwise>

                            </c:choose>
                            </tbody>
                        </table>
                    </div>

                </div>
            </div>
        </div>
    </section>
</div>
