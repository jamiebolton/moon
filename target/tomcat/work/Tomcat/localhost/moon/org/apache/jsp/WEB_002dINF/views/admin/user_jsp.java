/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-05-27 02:47:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/commons/global.jsp", Long.valueOf(1463671328000L));
    _jspx_dependants.put("/commons/basejs.jsp", Long.valueOf(1463671328000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      if (_jspx_meth_c_005fset_005f2(_jspx_page_context))
        return;
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"edge\" />\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/style/images/favicon.ico\" />\n");
      out.write("<!-- [my97日期时间控件] -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/My97DatePicker/WdatePicker.js\" charset=\"utf-8\"></script>\n");
      out.write("<!-- [jQuery] -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/easyui/jquery.min.js\" charset=\"utf-8\"></script>\n");
      out.write("<!-- [EasyUI] -->\n");
      out.write("<link id=\"easyuiTheme\" rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/easyui/themes/gray/easyui.css\" />\n");
      out.write("<link id=\"easyuiTheme\" rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/easyui/themes/icon.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/easyui/jquery.easyui.min.js\" charset=\"utf-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/easyui/locale/easyui-lang-zh_CN.js\" charset=\"utf-8\"></script>\n");
      out.write("<!-- [扩展JS] -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/extJs.js\" charset=\"utf-8\"></script>\n");
      out.write("<!-- [扩展样式] -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/style/css/dreamlu.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/icommon.css\" />\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var basePath = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\n");
      out.write("</script>");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"edge\" />\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>用户管理</title>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("    var dataGrid;\n");
      out.write("    var organizationTree;\n");
      out.write("\n");
      out.write("    $(function() {\n");
      out.write("        organizationTree = $('#organizationTree').tree({\n");
      out.write("            url : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/organization/tree',\n");
      out.write("            parentField : 'pid',\n");
      out.write("            lines : true,\n");
      out.write("            onClick : function(node) {\n");
      out.write("                dataGrid.datagrid('load', {\n");
      out.write("                    organizationId: node.id\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        dataGrid = $('#dataGrid').datagrid({\n");
      out.write("            url : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/dataGrid',\n");
      out.write("            fit : true,\n");
      out.write("            striped : true,\n");
      out.write("            rownumbers : true,\n");
      out.write("            pagination : true,\n");
      out.write("            singleSelect : true,\n");
      out.write("            idField : 'id',\n");
      out.write("            sortName : 'createdate',\n");
      out.write("            sortOrder : 'asc',\n");
      out.write("            pageSize : 20,\n");
      out.write("            pageList : [ 10, 20, 30, 40, 50, 100, 200, 300, 400, 500 ],\n");
      out.write("            columns : [ [ {\n");
      out.write("                width : '80',\n");
      out.write("                title : '登录名',\n");
      out.write("                field : 'loginname',\n");
      out.write("                sortable : true\n");
      out.write("            }, {\n");
      out.write("                width : '80',\n");
      out.write("                title : '姓名',\n");
      out.write("                field : 'name',\n");
      out.write("                sortable : true\n");
      out.write("            },{\n");
      out.write("                width : '80',\n");
      out.write("                title : '部门ID',\n");
      out.write("                field : 'organizationId',\n");
      out.write("                hidden : true\n");
      out.write("            },{\n");
      out.write("                width : '80',\n");
      out.write("                title : '所属部门',\n");
      out.write("                field : 'organizationName'\n");
      out.write("            },{\n");
      out.write("                width : '130s',\n");
      out.write("                title : '创建时间',\n");
      out.write("                field : 'createdate',\n");
      out.write("                sortable : true\n");
      out.write("            },  {\n");
      out.write("                width : '40',\n");
      out.write("                title : '性别',\n");
      out.write("                field : 'sex',\n");
      out.write("                sortable : true,\n");
      out.write("                formatter : function(value, row, index) {\n");
      out.write("                    switch (value) {\n");
      out.write("                    case 0:\n");
      out.write("                        return '男';\n");
      out.write("                    case 1:\n");
      out.write("                        return '女';\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }, {\n");
      out.write("                width : '40',\n");
      out.write("                title : '年龄',\n");
      out.write("                field : 'age',\n");
      out.write("                sortable : true\n");
      out.write("            },{\n");
      out.write("                width : '120',\n");
      out.write("                title : '电话',\n");
      out.write("                field : 'phone',\n");
      out.write("                sortable : true\n");
      out.write("            }, \n");
      out.write("            {\n");
      out.write("                width : '200',\n");
      out.write("                title : '角色',\n");
      out.write("                field : 'rolesList',\n");
      out.write("                sortable : true,\n");
      out.write("                formatter : function(value, row, index) {\n");
      out.write("                    var roles = [];\n");
      out.write("                    for(var i = 0; i< value.length; i++) {\n");
      out.write("                        roles.push(value[i].name);  \n");
      out.write("                    }\n");
      out.write("                    return(roles.join('\\n'));\n");
      out.write("                }\n");
      out.write("            }, {\n");
      out.write("                width : '60',\n");
      out.write("                title : '用户类型',\n");
      out.write("                field : 'usertype',\n");
      out.write("                sortable : true,\n");
      out.write("                formatter : function(value, row, index) {\n");
      out.write("                    if(value == 0) {\n");
      out.write("                        return \"管理员\";\n");
      out.write("                    }else if(value == 1) {\n");
      out.write("                        return \"用户\";\n");
      out.write("                    }\n");
      out.write("                    return \"未知类型\";\n");
      out.write("                }\n");
      out.write("            },{\n");
      out.write("                width : '60',\n");
      out.write("                title : '状态',\n");
      out.write("                field : 'status',\n");
      out.write("                sortable : true,\n");
      out.write("                formatter : function(value, row, index) {\n");
      out.write("                    switch (value) {\n");
      out.write("                    case 0:\n");
      out.write("                        return '正常';\n");
      out.write("                    case 1:\n");
      out.write("                        return '停用';\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            } , {\n");
      out.write("                field : 'action',\n");
      out.write("                title : '操作',\n");
      out.write("                width : 130,\n");
      out.write("                formatter : function(value, row, index) {\n");
      out.write("                    var str = '';\n");
      out.write("                        ");
      if (_jspx_meth_shiro_005fhasPermission_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_shiro_005fhasPermission_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    return str;\n");
      out.write("                }\n");
      out.write("            }] ],\n");
      out.write("            onLoadSuccess:function(data){\n");
      out.write("                $('.user-easyui-linkbutton-edit').linkbutton({text:'编辑',plain:true,iconCls:'icon-edit'});\n");
      out.write("                $('.user-easyui-linkbutton-del').linkbutton({text:'删除',plain:true,iconCls:'icon-del'});\n");
      out.write("            },\n");
      out.write("            toolbar : '#toolbar'\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    function addFun() {\n");
      out.write("        parent.$.modalDialog({\n");
      out.write("            title : '添加',\n");
      out.write("            width : 500,\n");
      out.write("            height : 300,\n");
      out.write("            href : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/addPage',\n");
      out.write("            buttons : [ {\n");
      out.write("                text : '添加',\n");
      out.write("                handler : function() {\n");
      out.write("                    parent.$.modalDialog.openner_dataGrid = dataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好\n");
      out.write("                    var f = parent.$.modalDialog.handler.find('#userAddForm');\n");
      out.write("                    f.submit();\n");
      out.write("                }\n");
      out.write("            } ]\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function deleteFun(id) {\n");
      out.write("        if (id == undefined) {//点击右键菜单才会触发这个\n");
      out.write("            var rows = dataGrid.datagrid('getSelections');\n");
      out.write("            id = rows[0].id;\n");
      out.write("        } else {//点击操作里面的删除图标会触发这个\n");
      out.write("            dataGrid.datagrid('unselectAll').datagrid('uncheckAll');\n");
      out.write("        }\n");
      out.write("        parent.$.messager.confirm('询问', '您是否要删除当前用户？', function(b) {\n");
      out.write("            if (b) {\n");
      out.write("                var currentUserId = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionInfo.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';/*当前登录用户的ID*/\n");
      out.write("                if (currentUserId != id) {\n");
      out.write("                    progressLoad();\n");
      out.write("                    $.post('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/delete', {\n");
      out.write("                        id : id\n");
      out.write("                    }, function(result) {\n");
      out.write("                        if (result.success) {\n");
      out.write("                            parent.$.messager.alert('提示', result.msg, 'info');\n");
      out.write("                            dataGrid.datagrid('reload');\n");
      out.write("                        }\n");
      out.write("                        progressClose();\n");
      out.write("                    }, 'JSON');\n");
      out.write("                } else {\n");
      out.write("                    parent.$.messager.show({\n");
      out.write("                        title : '提示',\n");
      out.write("                        msg : '不可以删除自己！'\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function editFun(id) {\n");
      out.write("        if (id == undefined) {\n");
      out.write("            var rows = dataGrid.datagrid('getSelections');\n");
      out.write("            id = rows[0].id;\n");
      out.write("        } else {\n");
      out.write("            dataGrid.datagrid('unselectAll').datagrid('uncheckAll');\n");
      out.write("        }\n");
      out.write("        parent.$.modalDialog({\n");
      out.write("            title : '编辑',\n");
      out.write("            width : 500,\n");
      out.write("            height : 300,\n");
      out.write("            href : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/editPage?id=' + id,\n");
      out.write("            buttons : [ {\n");
      out.write("                text : '确定',\n");
      out.write("                handler : function() {\n");
      out.write("                    parent.$.modalDialog.openner_dataGrid = dataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好\n");
      out.write("                    var f = parent.$.modalDialog.handler.find('#userEditForm');\n");
      out.write("                    f.submit();\n");
      out.write("                }\n");
      out.write("            } ]\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function searchFun() {\n");
      out.write("        dataGrid.datagrid('load', $.serializeObject($('#searchForm')));\n");
      out.write("    }\n");
      out.write("    function cleanFun() {\n");
      out.write("        $('#searchForm input').val('');\n");
      out.write("        dataGrid.datagrid('load', {});\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body class=\"easyui-layout\" data-options=\"fit:true,border:false\">\n");
      out.write("    <div data-options=\"region:'north',border:false\" style=\"height: 30px; overflow: hidden;background-color: #fff\">\n");
      out.write("        <form id=\"searchForm\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>姓名:</th>\n");
      out.write("                    <td><input name=\"name\" placeholder=\"请输入用户姓名\"/></td>\n");
      out.write("                    <th>创建时间:</th>\n");
      out.write("                    <td>\n");
      out.write("                    <input name=\"createdateStart\" placeholder=\"点击选择时间\" onclick=\"WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})\" readonly=\"readonly\" />至<input  name=\"createdateEnd\" placeholder=\"点击选择时间\" onclick=\"WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})\" readonly=\"readonly\" />\n");
      out.write("                    <a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search',plain:true\" onclick=\"searchFun();\">查询</a><a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-cancel',plain:true\" onclick=\"cleanFun();\">清空</a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div data-options=\"region:'center',border:true,title:'用户列表'\" >\n");
      out.write("        <table id=\"dataGrid\" data-options=\"fit:true,border:false\"></table>\n");
      out.write("    </div>\n");
      out.write("    <div data-options=\"region:'west',border:true,split:false,title:'组织机构'\"  style=\"width:150px;overflow: hidden; \">\n");
      out.write("        <ul id=\"organizationTree\"  style=\"width:160px;margin: 10px 10px 10px 10px\">\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"toolbar\" style=\"display: none;\">\n");
      out.write("        ");
      if (_jspx_meth_shiro_005fhasPermission_005f2(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /commons/global.jsp(11,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("base");
    // /commons/global.jsp(11,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /commons/global.jsp(13,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("path");
    // /commons/global.jsp(13,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${base}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f2.setParent(null);
    // /commons/global.jsp(15,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setVar("staticPath");
    // /commons/global.jsp(15,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${base}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
    if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasPermission_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_005fhasPermission_005f0 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_005fhasPermission_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasPermission_005f0.setParent(null);
    // /WEB-INF/views/admin/user.jsp(131,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasPermission_005f0.setName("/user/edit");
    int _jspx_eval_shiro_005fhasPermission_005f0 = _jspx_th_shiro_005fhasPermission_005f0.doStartTag();
    if (_jspx_eval_shiro_005fhasPermission_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            str += $.formatString('<a href=\"javascript:void(0)\" class=\"user-easyui-linkbutton-edit\" data-options=\"plain:true,iconCls:\\'icon-edit\\'\" onclick=\"editFun(\\'{0}\\');\" >编辑</a>', row.id);\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_shiro_005fhasPermission_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasPermission_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f0);
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasPermission_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_005fhasPermission_005f1 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_005fhasPermission_005f1.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasPermission_005f1.setParent(null);
    // /WEB-INF/views/admin/user.jsp(134,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasPermission_005f1.setName("/user/delete");
    int _jspx_eval_shiro_005fhasPermission_005f1 = _jspx_th_shiro_005fhasPermission_005f1.doStartTag();
    if (_jspx_eval_shiro_005fhasPermission_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            str += '&nbsp;&nbsp;|&nbsp;&nbsp;';\n");
        out.write("                            str += $.formatString('<a href=\"javascript:void(0)\" class=\"user-easyui-linkbutton-del\" data-options=\"plain:true,iconCls:\\'icon-del\\'\" onclick=\"deleteFun(\\'{0}\\');\" >删除</a>', row.id);\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_shiro_005fhasPermission_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasPermission_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f1);
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasPermission_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_005fhasPermission_005f2 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_005fhasPermission_005f2.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasPermission_005f2.setParent(null);
    // /WEB-INF/views/admin/user.jsp(253,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasPermission_005f2.setName("/user/add");
    int _jspx_eval_shiro_005fhasPermission_005f2 = _jspx_th_shiro_005fhasPermission_005f2.doStartTag();
    if (_jspx_eval_shiro_005fhasPermission_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<a onclick=\"addFun();\" href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"plain:true,iconCls:'icon-add'\">添加</a>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_shiro_005fhasPermission_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasPermission_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f2);
    return false;
  }
}
