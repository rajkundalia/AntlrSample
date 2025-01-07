grammar XML;

// Define rules for XML elements, attributes, and text content
document
    : element* EOF // The document can contain zero or more elements followed by end of file
    ;

element
    : '<' Name (attribute)* '>'
      (textContent | element*)?
      '</' Name '>'
    ;

Name: [a-zA-Z_][a-zA-Z0-9_.-]*; // Element names can start with a letter or underscore

attribute
    : Name '=' '"' value '"'
    ;

value
    : ~'"'* // Value can be any character except for double quotes
    ;

textContent
    : ~('<' | '&')+ // Text content cannot contain '<' or '&'
    ;

// Whitespace rule
WS
    : [ \t\r\n]+ -> skip; // Skip whitespace
