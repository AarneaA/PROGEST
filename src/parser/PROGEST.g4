grammar PROGEST;

program
    : sentences
    ;

sentences
    : sentence ';' (sentence ';')*
    ;

sentence
    : ifSentence
    | whileSentence
    | forSentence
    | assignment
    | expression
    | '{' sentences '}'
    ;

ifSentence
    : 'kui' expression 'siis' '{' sentence '}' 'muidu' '{' sentence '}'
    ;

whileSentence
    : 'kuni' expression 'tee' sentence
    | 'tee' sentence 'kuni' expression
    ;
    
forSentence
	: 'iga' expression 'korral vahemikus' expression '{' sentence '}'
	;

assignment
    : Variable '=' expression
    ;

expression
    : expression ('>'|'<'|'>='|'<='|'=='|'!=') expression #Comparison
    | expression ('+'|'-') expression #AdditionSubtraction
    | expression ('*'|'/') expression #MultiplicationDivision
    | expression '..' expression #Range
    | Variable '(' (expression (',' expression)*)? ')' #FunctionCall
    | '-' expressionNegatives #Negatives
    | Variable #VariableLiteral
    | Number #NumberLiteral
    | String #StringLiteral
    | '(' expression ')' #Expressions
    ;
    
expressionNegatives
	: Number
	| Variable
	| '(' expression')'
	;
    

Variable
    : [a-zA-Z][a-zA-Z0-9_]*
    ;

Number
    :   ('0'|[1-9][0-9]*)('.'[0-9]+)?
    ;

String
    :   '"' ~["\n\r]* '"'
    ;

Comment
    :   '/*' .*? '*/' -> skip
    ;

Whitespace
    :   [ \t\r\n]+ -> skip
    ;