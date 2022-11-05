grammar JavaGr;

// -no-listener
// nieterminale z małej litery, tokeny all capital / One calpital first

//@header {
//package antlr;
//}

//start symbol
//tokens
STRING_VAL: '"' ('\\' ["\\] | ~["\\\r\n])* '"' ;
CHAR_VAL: '\'' ('\\' ["\\] | ~['\\\r\n]) '\'' ;
INT_VAL: [1-9][0-9]*;
FLOAT_VAL: ([0-9]*[.])?[0-9]+'f';
DOUBLE_VAL:  ([0-9]*[.])?[0-9]+;
DO_: 'do';
FLOAT: 'float';
INT: 'int';
DOUBLE: 'double';
STRING: 'string';
CHAR: 'char';
BOOL: 'boolean';
PUBLIC: 'public';
CLASS: 'class';
TRUE: 'true';
FALSE: 'false';
EQUAL: '=';
NOT_EQUAL: '!=';
GREATER: '>';
LESS: '<';
GREATER_EQUAL: '>=';
LESS_EQUAL: '<=';
BRACKET_L: '(';
BRACKET_R: ')';
SQ_BRACKET_L: '[';
SQ_BRACKET_R: ']';
PARENT_L: '{';
PARENT_R: '}';
ADD_: '+';
SUBTRACT_: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';
COMMENT: '//'~[\r\n]*;
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
SEMICOLON: ';';
COMMA: ',';
IMPORT: 'import';
PACKAGE: 'package';
RETURN: 'return';
PRIVATE_NEW_VAR: 'private';
PROTECTED_NEW_VAR: 'protected';
STATIC_VAR: 'static';
OR: '||';
AND: '&&';
VOID: 'void';
IDENTIFIER: [a-zA-Z][a-zA-Z0-9]*;
WS   : [ \t\r\n]+ -> skip;
BUFFERED_READER: 'BufferedReader';
SOUT_L: 'System.out.print';
NEW: 'new';
INPUT_READER: 'InputStreamReader';
SYS_IN: 'System.in';
//prog: (package (import_op)* class)?;
prog: function;
numeric_type: INT
| FLOAT
| DOUBLE;
text_type: CHAR
| STRING;
datatype: numeric_type
| text_type
| BOOL;
bool_val: TRUE
| FALSE;
num_val: (ADD_ | SUBTRACT_)? INT_VAL
| (ADD_ | SUBTRACT_)? DOUBLE_VAL
| (ADD_ | SUBTRACT_)? FLOAT_VAL
| (ADD_ | SUBTRACT_)? IDENTIFIER;
//declaration_var: (PUBLIC | PRIVATE_NEW_VAR | PROTECTED_NEW_VAR)? STATIC_VAR? (declaration | assignment)  SEMICOLON;
input_vars: datatype IDENTIFIER (COMMA datatype IDENTIFIER)*;
function_in: BRACKET_L input_vars? BRACKET_R;
//function_to_ret: (PUBLIC | PRIVATE_NEW_VAR | PROTECTED_NEW_VAR) STATIC_VAR? datatype IDENTIFIER function_in;
input_vars_2:  IDENTIFIER (COMMA  IDENTIFIER)*;
function_in_2: BRACKET_L input_vars_2? BRACKET_R;
function_to_ret: IDENTIFIER function_in_2;
return_statement: RETURN (IDENTIFIER | math_expr | bool_val | CHAR_VAL | STRING_VAL | function_to_ret)?;
elif_statement: if_statement (ELSE if_statement)*;
instruction: declaration SEMICOLON
| assignment SEMICOLON
| modification SEMICOLON
| if_statement
| elif_statement
| while_loop
| do_while_loop SEMICOLON
| for_loop
| sin SEMICOLON
| sout SEMICOLON
| return_statement SEMICOLON;
instruction_general: (instruction | COMMENT)*;
function_body: PARENT_L instruction_general PARENT_R;
function: (PUBLIC | PRIVATE_NEW_VAR | PROTECTED_NEW_VAR)? STATIC_VAR? (datatype | VOID ) IDENTIFIER function_in function_body ;
//content: declaration_var | function;
//class: PUBLIC CLASS IDENTIFIER PARENT_L  (content)* PARENT_R;
math_symbol: ADD_
| SUBTRACT_
| MULTIPLY
| DIVIDE
| MODULO;
add_equals: ADD_ EQUAL;
subtract_equals: SUBTRACT_ EQUAL;
multiply_equals: MULTIPLY EQUAL;
divide_equals: DIVIDE EQUAL;
modulo_equals: MODULO EQUAL;
math_modification: add_equals
| subtract_equals
| multiply_equals
| divide_equals
| modulo_equals
| EQUAL;
math_expr: math_expr math_symbol math_expr
| BRACKET_L math_expr BRACKET_R
| num_val;
comma_identifier: COMMA IDENTIFIER;
declaration: datatype IDENTIFIER(comma_identifier)*;
assignment: numeric_type IDENTIFIER EQUAL math_expr
| CHAR IDENTIFIER EQUAL CHAR_VAL
| STRING IDENTIFIER EQUAL STRING_VAL
| BOOL IDENTIFIER EQUAL bool_val;
add_double: ADD_ ADD_;
equal_double: EQUAL  EQUAL;
subtract_double: SUBTRACT_ SUBTRACT_;
modification: IDENTIFIER math_modification math_expr
| IDENTIFIER add_double
| IDENTIFIER subtract_double;
comparator: equal_double
| NOT_EQUAL
| GREATER
| LESS
| GREATER_EQUAL
| LESS_EQUAL;

comparison: num_val comparator num_val;
logic_statement: comparison | bool_val;
logic_operator: OR | AND;
logic_condition: BRACKET_L logic_statement (logic_operator logic_statement)* BRACKET_R;
if_statement: IF logic_condition PARENT_L instruction_general PARENT_R;
while_loop: WHILE logic_condition PARENT_L instruction_general PARENT_R;
do_while_loop: DO_ PARENT_L instruction_general PARENT_R WHILE logic_condition;
for_loop: FOR BRACKET_L assignment SEMICOLON comparison SEMICOLON modification BRACKET_R PARENT_L instruction_general PARENT_R;
sout: SOUT_L BRACKET_L (STRING_VAL | math_expr | bool_val | CHAR_VAL ) BRACKET_R;
sin: BUFFERED_READER IDENTIFIER EQUAL NEW BUFFERED_READER PARENT_L NEW INPUT_READER PARENT_L SYS_IN PARENT_R PARENT_R;
//package: PACKAGE IDENTIFIER SEMICOLON;
//import_op: IMPORT IDENTIFIER('.'IDENTIFIER)* SEMICOLON;