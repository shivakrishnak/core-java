import java.util.HashSet;
import java.util.Set;

class Name {

    private final String first, last;

    private Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Name)) {
            return false;
        }
        Name n = (Name) o;
        return n.first.equals(first) && n.last.equals(last);
    }

    // what will be the output?
    public static void main(String[] args) {
        Set<Name> names = new HashSet<>();
        names.add(new Name("Tom", "Smith"));
        System.out.println(
                names.contains(new Name("Tom", "Smith"))
        );
    }
}