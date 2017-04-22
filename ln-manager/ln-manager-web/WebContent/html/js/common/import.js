/**
 * 系统公共JS、CSS文件统一引用入口
 */
// 系统CSS文件对象
var common_css_files = [ 'html/tool/layui/css/layui.css' ];

// 系统公共JS文件对象
var common_js_files = [ 'html/tool/jquery/jquery-1.12.3.min.js',
		'html/tool/layui/layui.js' ];

/**
 * 导入CSS文件
 */
for (var i = 0; i < common_css_files.length; i++) {
	document.write("<link rel='stylesheet' type='text/css' href='"
			+ common_css_files[i] + "'>");
}
/**
 * 导入JS文件
 */
for (var i = 0; i < common_js_files.length; i++) {
	document.write("<script type='text/javascript' src='" + common_js_files[i]
			+ "'></script>");
}
