grammar PROGEST;

program
    : sentences
    ;

sentences
    : sentence (';' sentence)*
    ;

sentence
    : ifSentence
    | whileSentence
    | assignment
    | declaration
    | expression
    | '{' sentences '}'
    ;

ifSentence
    : 'kui' expression 'siis' '{' sentence '}' 'muidu' '{' sentence '}'
    ;

whileSentence
    : 'kuni' expression 'tee' '{' sentence '}'
    | 'tee' '{' sentence '}' 'kuni' expression
    ;

assignment
    : Variable '=' expression
    ;

declaration
    : 'muut' Variable '=' expression
    ;

expression
    : Variable
    ;

Variable
    : [a-zA-Z][a-zA-Z0-9_]*
    ;