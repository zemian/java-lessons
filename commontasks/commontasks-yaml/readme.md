YAML is the abbreviated form of “YAML Ain’t markup language” is a data serialization language.

* https://bitbucket.org/asomov/snakeyaml/wiki/Documentation
* https://www.tutorialspoint.com/yaml/index.htm

## Synopsis of YAML Basic Elements

The synopsis of YAML basic elements is given here: 

* Comments in YAML begins with the (`#`) character.
* Comments must be separated from other tokens by whitespaces.
* Indentation of whitespace is used to denote structure.
* Tabs are not included as indentation for YAML files.
* List members are denoted by a leading hyphen (`-`).
* List members are enclosed in square brackets and separated by commas.
* Associative arrays are represented using colon ( `:` ) in the format of key value pair. They are enclosed in curly braces `{}`.
* Multiple documents with single streams are separated with 3 hyphens (`---`).
* Repeated nodes in each file are initially denoted by an ampersand (`&`) and by an asterisk (`*`) mark later.
* YAML always requires colons and commas used as list separators followed by space with scalar values.
* Nodes should be labelled with an exclamation mark (`!`) or double exclamation mark (`!!`), followed by string which can be expanded into an URI or URL.
