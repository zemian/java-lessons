package java17demo.sealedclasses;

// Sealed classes in JDK17 is now finalized, not experimental.
public sealed abstract class Shape
    permits Circle, Rectangle {
}
