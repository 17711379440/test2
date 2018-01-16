<!doctype html>
<html lang="zh_CN">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
    </head>
    <body>
    名称：${name}<br>
    性别：<#if sex==1>
        男
    <#elseif sex==0>
        女
    <#else >
        其他
    </#if>
    <table border="1" cellspacing="0">
        <#list userList as user>
            <tr>
                <td>${user}</td>
            </tr>
        </#list>
    </table>
    </body>
</html>