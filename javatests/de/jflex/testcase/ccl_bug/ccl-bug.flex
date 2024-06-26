/*
 * Copyright 2020, Gerwin Klein <lsf@jflex.de>
 * SPDX-License-Identifier: BSD-3-Clause
 */

package de.jflex.testcase.ccl_bug;

%%

%class CclBug
%8bit
%standalone

%%

[\t\n]+			   {}
'(\\'|[^'])*'	 {}
[ ]				{}
"=="			{}
"!="			{}
"<"				{}
"<="			{}
">"				{}
">="			{}
"in"			{}
"and"|
"AND"			{}
"or"|
"OR"			{}
"not"|
"NOT"			{}
"match"|
"MATCH"			{}
"find"|
"FIND"			{}
[A-Za-z$][A-Za-z0-9_]*	{}
[0-9]+|
[0-9]+\.[0-9]+	{}
"{"			{}
"}"			{}
[-+*/()] {}


