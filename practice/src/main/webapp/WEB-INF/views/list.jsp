<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page session="false" %>
      <!DOCTYPE html>
      <html>

      <head>
        <meta charset="UTF-8">
        <script src="./resources/compnent/jquery-3.3.1.min.js"></script>
        <script src="./resources/compnent/jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>

        <script src="./resources/compnent/jquery-loading-master/dist/jquery.loading.min.js"></script>
        <script src="./resources/compnent/jqueryPrint/jqueryPrint.js"></script>

        <script src="http://dmaps.daum.net/map_js_init/postcode.v2.js?autoload=false"></script>

        <script src="./resources/js/util/util.js"></script>
        <script src="./resources/js/personalHistory/personalHistory.js?ver=46" charset="UTF-8"></script>
        <script src="./resources/js/personalHistory/personalHistoryFunc.js?ver=46" charset="UTF-8"></script>

        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="./resources/css/list/fonts/style.css">
        <link rel="stylesheet" href="./resources/css/list/owl.carousel.min.css">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="./resources/css/list/bootstrap.min.css">
        <!-- Style -->
        <link rel="stylesheet" href="./resources/css/list/style.css">

        <title>All List</title>

      </head>

      <body>
        <script>




          /*$("#deleteBtn").click(function deleteList() {
       	
         var cnt = $("input[name='checkDel']:checked").length;
         var arr = new Array();
         $("input[name='checkDel']:checked").each(function() {
           arr.push($(this).attr('id'));
         });
       	
         alert("삭제버튼 클릭~~===>> " + arr);
         if(cnt == 0) {
           alert("하나 이상의 값을 선택 해주세요.");
         } else {
           $.ajax({
             type: "POST",
             url: "./personalHistory/userDelete",
             data: "chk=" + arr,
             dataType: "json",
             success: function(jdata) {
               alert("jdata.result=====>>" + jdata.result);
               if(jdata.result != "ok") {
                             alert("삭제 오류");
                         }
                         else{
                             alert("삭제 성공");
                         }
             },
             error: function() {
               alert("서버 통신 오류!!");
             }
           });
         }
       });*/




          function deleteBtn() {


            var cnt = $("input[name='checkDel']:checked").length;
            var arr = new Array();
            $("input[name='checkDel']:checked").each(function () {
              arr.push($(this).attr('id'));
            });

            alert("삭제버튼 클릭~~===>> " + arr);
            if (cnt == 0) {
              alert("하나 이상의 값을 선택 해주세요.");
            } else {
              $.ajax({
                type: "POST",
                url: "./personalHistory/userDelete",
                data: "chk=" + arr,
                dataType: "json",
                success: function (data) {
                  alert("data.result=====>>" + data.result);
                  if (data.result != "ok") {
                    alert("삭제 실패");
                  }
                  else {
                    location.reload();
                  }

                },
                error: function () {
                  alert("서버 통신 오류");
                  location.reload();
                }
              });
            }

          }


          function deleteList() {
            var checkDel = document.getElementsByClassName("checkDel");

          }




        </script>


        <div class="content">

          <div class="container">
            <h2 class="mb-5">Table</h2>

            <form action="/prac/detail" id="detailFrm" name="detailFrm" method="post">
              <input type="hidden" id="userIdx" name="userIdx" autocomplete="off">
            </form>

            <div class="table-responsive">
              <!-- 검색 폼 -->
              <form action="<%=request.getContextPath() %>/" id="frm" name="frm" method="post">
                <!-- <input type="hidden" id="userInfoTotalCnt" name="userInfoTotalCnt" value="${userInfoTotalCnt}">
                  <input type="hidden" id="userDelete" name="userDelete" value="${userDelete}">
                  <input type="hidden" id="userInfoPageSize" name="userInfoPageSize" value="10">
                  <input type="hidden" id="userInfoPageNo" name="userInfoPageNo" value="${nowPage}">
                  
                  <input type="hidden" id="prevLimit" name="prevLimit">
                  <input type="hidden" id="laterLimit" name="laterLimit"> -->


                <!-- <input type="hidden" id="userInfoTotalCnt">
                  <input type="hidden" id="userInfoPageSize" value="5">
                  <input type="hidden" id="userInfoPageNo" value="1"> -->

                <select id="userListSearchPeriod" name="userListSearchPeriod">
                  <option value="">검색조건</option>
                  <option value="userName">이름</option>
                  <option value="userComp">소속회사</option>
                  <option value="userDept">부서</option>
                  <option value="careerDate">경력(년차)</option>
                  <option value="userAddress">주소</option>
                </select>

                <input type="text" id="userListSearchWord" name="userListSearchWord" value="${userListSearchWord}"
                  autocomplete="off">


                <!-- <button id="userListSearchBtn" class="user-list-search-btn">검색</button> -->
                <button id="userListSearchBtn2" class="user-list-search-btn" onclick="goPage(${nowPage})">검색</button>
              </form>
              <table class="table custom-table">
                <thead>
                  <tr>
                    <th scope="col">
                      <label class="control control--checkbox">
                        <input id="checkAll" name="checkAll" type="checkbox" class="js-check-all" />
                        <div class="control__indicator"></div>
                      </label>
                    </th>
                    <th scope="col">등록번호</th>
                    <th scope="col">이름</th>
                    <th scope="col">소속회사</th>
                    <th scope="col">부서</th>
                    <th scope="col">성별</th>
                    <th scope="col">경력</th>
                    <th scope="col">등록날짜</th>
                  </tr>
                </thead>
                <tbody>
                  <button onclick="deleteBtn('이벤트')" id="deleteBtn2" name="deleteBtn">삭제</button>
                  <c:forEach items="${userList}" var="list">
                    <!-- <tr onclick="location.href='${path}detail?userIdx=${list.userIdx}'">
                        <!-- <tr> -->
                    <tr>
                      <td scope="row">
                        <label class="control control--checkbox">
                          <input type="checkbox" id="${list.userIdx}" name="checkDel" />
                          <div class="control__indicator"></div>
                        </label>
                      </td>
                      <div>
                        <td onclick="detailLink(${list.userIdx});">
                          <c:out value="${list.userIdx}"></c:out>
                        </td>
                        <td onclick="detailLink(${list.userIdx});">
                          <c:out value="${list.userName}"></c:out>
                        </td>
                        <td onclick="detailLink(${list.userIdx});">
                          <c:out value="${list.userComp}"></c:out>
                        </td>
                        <td onclick="detailLink(${list.userIdx});">
                          <c:out value="${list.userDept}"></c:out>
                        </td>
                        <td onclick="detailLink(${list.userIdx});">
                          <c:out value="${list.userSex}"></c:out>
                        </td>
                        <td onclick="detailLink(${list.userIdx});">
                          <c:out value="${list.careerDate}"></c:out>
                        </td>
                        <td onclick="detailLink(${list.userIdx});">
                          <c:out value="${list.userRegisterDate}"></c:out>
                        </td>
                      </div>
                    </tr>
                  </c:forEach>

                <tbody>

                </tbody>



                </tbody>
              </table>
              <!-- <div class="pop-paging-pannel2">
			
              </div> -->

              <br>
              <div class="pagination">
                <ul>
                  <c:if test="${paging.prev}">
                    <span>
                      <a href='<c:url value="/?page=${paging.startPage - 1}"/>'>이전<i
                          class='bx bxs-chevron-left'></i></a>
                    </span>
                  </c:if>
                  <c:forEach begin="${paging.startPage}" end="${paging.endPage}" var="num">
                    <c:choose>
                      <c:when test="${paging.criteria.page eq num}">
                        <span><a class="active">${num}</a></span>
                      </c:when>
                      <c:otherwise>
                        <span><a href='<c:url value="/?page=${num}"/>'>${num}</a></span>
                      </c:otherwise>
                    </c:choose>
                  </c:forEach>
                  <c:if test="${paging.next && paging.endPage > 0}">
                    <span>
                      <a href='<c:url value="/?page=${paging.endPage + 1}"/>'><i class='bx bxs-chevron-right'>다음</i></a>
                    </span>
                  </c:if>
                </ul>
              </div>

            </div>



          </div>

        </div>

        <script>


        </script>



        <script src="./resources/js/list/jquery-3.3.1.min.js"></script>
        <script src="./resources/js/list/popper.min.js"></script>
        <script src="./resources/js/list/bootstrap.min.js"></script>
        <script src="./resources/js/list/main.js"></script>
      </body>

      </html>