<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户列表</title>
</head>
<body>
<table cellspacing="1" cellpadding="0" border="0" width="100%" class="pn-ltable">
    <thead class="pn-lthead">
    <tr>
        <th width="20"><input type="checkbox" onclick="Pn.checkbox('ids',this.checked)"/></th>
        <th>用户编号</th>
        <th>用户头像</th>
        <th>用户名</th>
        <th>真实姓名</th>
        <th>性别</th>
        <th>出生年月</th>
        <th>邮箱</th>
        <th>可操作项</th>
    </tr>
    </thead>
    <tbody class="pn-ltbody">
    <#list pageInfo.list as user>
        <tr bgcolor="#ffffff" onmouseover="this.bgColor='#eeeeee'" onmouseout="this.bgColor='#ffffff'">
            <td><input type="checkbox" name="ids" value="${user.id }"/></td>
            <td align="center">${user.id }</td>
            <td align="center"><img src="/pic/${user.userpic}" style="width:50px;height:50px"/></td>
            <td align="center">${user.loginname }</td>
            <td align="center">${user.realname }</td>
            <td align="center">${user.sex }</td>
            <td align="center">${user.birthday }</td>
            <td align="center">${user.email }</td>
            <td align="center">
                <a href="selectUserById.do?id=${user.id }" class="pn-opt">修改</a>
                <a href="userDelete.do?id=${user.id }" class="pn-opt">删除</a>
            </td>
        </tr>
    </#list>
    </tbody>
</table>
<div style="overflow: hidden;">
    <!--<input class="del-button" type="button" value="取消" onclick="optCancel();"/>

    <input class="submit" type="button" value="通过" onclick="optPass();"/> -->
    <!-- turn page -->
    <div style="float:right; text-align:right;font-size:14px;color:#ff2a2f;">
        当前第${pageInfo.pageNum} 页.总共${pageInfo.pages}  页.一共${pageInfo.total } 条记录
        <nav aria-label="Page navigation">
            <a href="selectUserList.do?pageNum=1">首页</a>
            <!--上一页-->
            <#if pageInfo.hasPreviousPage>
                <a href="selectUserList.do?pageNum=${pageInfo.pageNum-1}" aria-label="Previous"> <span aria-hidden="true">«</span></a>
            </#if>
            <!--循环遍历连续显示的页面，若是当前页就高亮显示，并且没有链接-->
            <#list pageInfo.navigatepageNums as page_num>
                <#if page_num==pageInfo.pageNum>
                    <a href="#">${page_num}</a>
                </#if>
                <#if page_num!=pageInfo.pageNum>
                    <a href="selectUserList.do?pageNum=${page_num}">${page_num}</a>
                </#if>
            </#list>
            <!--下一页-->
            <#if pageInfo.hasNextPage>
                <a href="selectUserList.do?pageNum=${pageInfo.pageNum+1}" aria-label="Next"> <span aria-hidden="true">»</span></a>
            </#if>

            <a href="selectUserList.do?pageNum=${pageInfo.pages}">尾页</a>
        </nav>

    </div>
    <!-- end  page-->
</div>
</body>