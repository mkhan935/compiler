class MulPrimaryItem extends PrimaryItem

// Represents "* <primary>"

{
    // Primary primary; inherited from PrimaryItem

    MulPrimaryItem(Primary p)
    {
        primary = p;
    }

    void printParseTree(String indent)
    {
        IO.displayln(indent + indent.length() + " *");
        primary.printParseTree(indent);
    }
}