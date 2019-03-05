<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@include file="../shared/flows-header.jsp"%>
<spring:url var="images" value="/resources/images" />
<style>
.backg
{
	
	background: url("${images}/Paris.jpg") no-repeat;
	background-size: 100% 100vh;
    
}
.panel{
border:1px solid;
background: url("${images}/Paris.jpg") no-repeat;
	background-size: 100% 100%;
	margin-top: 20px;
	-webkit-box-shadow: -2px 11px 75px -7px rgba(0,0,0,0.69);
-moz-box-shadow: -2px 11px 75px -7px rgba(0,0,0,0.69);
box-shadow: -2px 11px 75px -7px rgba(0,0,0,0.69);
}
.panel-heading h4{
font-family: cursive;
text-align: center;
}
.panel-heading{

background-color: red;
}
.panel-heading>.dropdown .dropdown-toggle {
	color: inherit
}
.panel-title {
	margin-top: 0;
	margin-bottom: 0;
	font-size: 18px;
	color: red;
}
</style>


<div class="container backg">
	<div class="row">
	

		<div class="col-md-6 col-md-offset-3">

			<div class="panel panel-primary">

				<div class="panel-heading">
					<h4>Sign Up </h4>
				</div>

				<div class="panel-body">

					<sf:form method="POST" modelAttribute="user"
						class="form-horizontal" id="registerForm">


						<div class="form-group">
							<label class="control-label col-md-4">First Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="firstName" class="form-control"
									placeholder="First Name" />
								<sf:errors path="firstName" cssClass="help-block" element="em" />
							</div>
						</div>


						<div class="form-group">
							<label class="control-label col-md-4">Last Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="lastName" class="form-control"
									placeholder="Last Name" />
								<sf:errors path="lastName" cssClass="help-block" element="em" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Email</label>
							<div class="col-md-8">
								<sf:input type="text" path="email" class="form-control"
									placeholder="abc@zyx.com" />
								<sf:errors path="email" cssClass="help-block" element="em" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Contact Number</label>
							<div class="col-md-8">
								<sf:input type="text" path="contactNumber" class="form-control"
									placeholder="XXXXXXXXXX" maxlength="10" />
								<sf:errors path="contactNumber" cssClass="help-block"
									element="em" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Password</label>
							<div class="col-md-8">
								<sf:input type="password" path="password" class="form-control"
									placeholder="Password" />
								<sf:errors path="password" cssClass="help-block" element="em" />
							</div>
						</div>


						<div class="form-group">
							<label class="control-label col-md-4">Password</label>
							<div class="col-md-8">
								<sf:input type="password" path="confirmPassword"
									class="form-control" placeholder="Re-enter Password" />
								<sf:errors path="confirmPassword" cssClass="help-block"
									element="em" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Select Role</label>
							<div class="col-md-8">
								<label class="radio-inline"> <sf:radiobutton path="role"
										value="USER" checked="checked" /> User
								</label> <label class="radio-inline"> <sf:radiobutton
										path="role" value="SUPPLIER" /> Supplier
								</label>
							</div>
						</div>

						<div class="form-group">
							<div class="col-md-offset-4 col-md-8">
								<button type="submit" name="_eventId_billing"
									class="btn btn-primary">
									Next - Billing 
								</button>
							</div>
						</div>


					</sf:form>


				</div>


			</div>


		</div>


	</div>


</div>
<!-- Footer -->

<%@include file="../shared/flows-footer.jsp"%>