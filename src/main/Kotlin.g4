grammar Kotlin ;

program
    :  func_main EOF
    ;

func_main
    : func 'main' OPEN_P CLOSE_P OPEN_B block CLOSE_B
    ;

block
    : statement+
    ;


statement
    : assignment_statement
    | print_statement
    | if_statement
    | while_statement
    | repeat_statement
    ;

// ----------------------------------------------------------------------------------

assignment_statement
    : declaration ID ':' type '=' expr      # varDeclaration
    | re_assignment                         # varReassignment
    ;

re_assignment
    : ID '=' expr                           # reassignment
    | ID op=(INCREMENT|DECREMENT)         # incrementOrDecrement
    | expr op=(MULT|DIV|ADD|SUB)'=' expr    # simpleOp
    ;

// ----------------------------------------------------------------------------------

print_statement
    : printnormal                       # printNormal
    | printline                         # printLine
    ;

// ----------------------------------------------------------------------------------

expr
    : expr op=(MULT|DIV) expr       # MultOrDiv
    | expr op=(ADD|SUB) expr        # AddOrSub
    | DOUBLE                        # double
    | 'scan()'                      # scan
    | INT                           # int
    | STRING                        # string
    | ID                            # id
    | OPEN_P expr CLOSE_P           # parenthesis
    ;

// ----------------------------------------------------------------------------------

printnormal
    : 'print' OPEN_P expr (',' expr)* CLOSE_P
    ;

printline
    : 'println' OPEN_P expr (',' expr)* CLOSE_P
    ;

// ----------------------------------------------------------------------------------

if_statement
    : 'if' OPEN_P comṕarison CLOSE_P OPEN_B block ab CLOSE_B (else_block)?
    ;

else_block
    : 'else' OPEN_B block CLOSE_B
    ;

ab: ;

// ----------------------------------------------------------------------------------
while_statement
    : 'while' OPEN_P comṕarison CLOSE_P OPEN_B block CLOSE_B
    ;

repeat_statement
    : 'repeat' OPEN_P (INT|DOUBLE|STRING) CLOSE_P OPEN_B block CLOSE_B
    ;
// ----------------------------------------------------------------------------------

comṕarison
    : expr GREATER_EQUAL expr       # greaterOrEqual
    | expr GREATER expr             # greater
    | expr LESS_EQUAL expr          # lessOrEqual
    | expr LESS expr                # less
    | expr '==' expr                # equal
    | expr op=MODULO expr '==' expr # modulo
    ;

// ----------------------------------------------------------------------------------
declaration
    : 'val'
    ;

// ----------------------------------------------------------------------------------

// ----------------------------------------------------------------------------------


type
    : 'Int' | 'Double' | 'String'
    ;

// ----------------------------------------------------------------------------------

ID
    : [a-zA-Z]+
    ;


INT
    : ('-'|'+')?[0-9]+
    ;

DOUBLE
    : ('-'|'+')?[0-9]*'.'[0-9]+
    ;

STRING
    : '"' .*? '"'
    ;

MULT
    : '*'
    ;

DIV
    : '/'
    ;

ADD
    : '+'
    ;

SUB
    : '-'
    ;

INCREMENT
    : '++'
    ;

DECREMENT
    : '--'
    ;

MODULO
    : '%'
    ;

GREATER_EQUAL
    : '>='
    ;

GREATER
    : '>'
    ;

LESS_EQUAL
    : '<='
    ;

LESS
    : '<'
    ;

EQUAL
    : '=='
    ;

OPEN_P
    : '('
    ;

CLOSE_P
    : ')'
    ;

OPEN_B
    : '{'
    ;

CLOSE_B
    : '}'
    ;

func
    : 'fun'
    ;


WS : [ \t\r\n]+ -> skip ;