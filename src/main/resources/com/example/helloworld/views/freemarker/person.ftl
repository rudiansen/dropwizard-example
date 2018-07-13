<#-- @ftlvariable name="" type="com.example.helloworld.views.PersonView" -->
<#import "Layout.ftl" as layout>
<@layout.layout>
	<!-- calls getPerson().getFullName() and sanitizes it -->
	<h1>Hello, ${person.fullName}!</h1>
	You are an awesome ${person.jobTitle}.
</@layout.layout>