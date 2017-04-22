
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[proc_setTest]') 
and OBJECTPROPERTY(id, N'IsProcedure') = 1)  
drop procedure [dbo].[proc_setTest]  

GO  
create procedure [dbo].[proc_setTest]  
	@a int,
    @b int,
    @c int output
as
begin
	select * from Admin_User where id = @a and isRstriction = @b;
    set @c = @a+@b;
    return  @a+@b+10;
end

declare @c int
exec  proc_setTest 1,4,@c output 
print @c


if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[proc_selectTest]') 
and OBJECTPROPERTY(id, N'IsProcedure') = 1)  
drop procedure [dbo].[proc_selectTest]  

GO  
create procedure [dbo].[proc_selectTest]  
	 @input_a int,
    @input_b int
as
begin
	select * from Admin_User where id = @input_a and isRstriction = @input_b;
end
exec proc_selectTest 1,0