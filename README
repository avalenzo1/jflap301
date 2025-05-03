# JFLAP
## How to build it
Install Maven, then run this:
```
mvn package
```
This creates the file `target/JFLAP.jar`. For distribution it also creates the files `target/jflap-x.y.jar` and `target/JFLAP-x.y-source.jar`, where x.y is the version number. The sources file includes the source code.

## How to run it
```
java -jar target/JFLAP.jar
```

## New in version 7.2
- possible to use multiple "~, ~, R" transitions in different states. 7.1 detected this always as non-deterministic, even if it was in different states
- when using a "~, ~, R" transition, this is sorted at the end now, so that something like "1, 1, R" has precedense, which is useful to keep scanning a tape by using a "~, ~, R" transition loop back to the same state, and then when it finds a "1", it transitions to the next state
- about dialog is fixed
There was still a bug that an URL was not found, probably related to the integrated help system, but looks like this never worked anyway in 7.1, so I just commented the warning message for now.

# Original readme
Thanks for your interest in JFLAP!

We are distributing both the JFLAP source and binary under the JFLAP 7.1 license, available in the file LICENSE.
Summary of the license: The license text must be included in any distribution of JFLAP. Any distribution of JFLAP or any work that includes it modified or unmodified must be available free of charge.

Please send us feedback as to how you ended up using JFLAP, as well as any changes you would like to see in the official version. Please send this to jflap@cs.duke.edu

We are working on setting up a version controlled repository, so that more people can get more directly involved in the development of JFLAP.
Once this is up, we will announce it on www.jflap.org, together with details on how to become a privileged contributor with commit rights. 
If you are interested in participating, please keep an eye on the website, or email jflap@cs.duke.edu indicating this interest.


Regards,

Susan Rodger
