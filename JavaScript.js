/* How to check whether a string contains a substring in JavaScript? */

	/*1. indexOf*/

var string = "foo",
    substring = "oo";
string.indexOf(substring) !== -1;


	/*2. (ES6) includes*/

var string = "foo",
    substring = "oo";
string.includes(substring);

	

	/*3. search*/

var string = "foo",
    expr = /oo/;
string.search(expr);


	/*4. lodash includes*/

var string = "foo",
    substring = "oo";
_.includes(string, substring);



	/*5. RegExp*/

var string = "foo",
    expr = /oo/;  // no quotes here
expr.test(string);


	/*6. Match*/

var string = "foo",
    expr = /oo/;
string.match(expr);