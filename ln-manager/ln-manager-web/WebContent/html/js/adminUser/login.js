$(function() {
	layui.use([ 'layer', 'form' ], function() {
		var layer = layui.layer, form = layui.form();

		$("#login").click(function() {
			layer.confirm('确认删除吗？', {
				btn : [ '确认', '取消' ]
			}, function() {
				
				
				var a = 1;
				if (a == 1) {
					layer.msg('删除成功', {
						icon : 1,
						time : 1500
					});
				} else {
					layer.msg('删除失败', {
						icon : 2,
						time : 1500
					});
				}
			}, function() {
			});
		});
	});
})
