### Singleton

#### Intent
    1. Ensure a class has only one instance, and provide a global point of access to it.

    2. Encapsulated "just-in-time initialization" or "initialization on first use". (Lazy initialization)

#### Criteria

    1. Ownership of the single instance cannot be reasonably assigned

    2. Lazy initialization is desirable

    3. Global access is not otherwise provided for

#### Check list
    1. Define a private static attribute in the "single instance" class.
    2. Define a public static accessor function in the class.
    3. Do "lazy initialization" (creation on first use) in the accessor function.
    4. Define all constructors to be protected or private.
    5. Clients may only use the accessor function to manipulate the Singleton.