# Coding Katas

This is the repository for the coding katas run by the DDG developer community

## Getting Started

In order to get yourself setup and utilise this repo, you'll need to do the following;

1. Create a Github account if you haven't already got one
2. Get one of the repo admins to add you as a collaborator (ask in slack if you're not sure who they are)
3. Setup your dev environment (skip to the next step if you're already sorted)
   1. Install Git (https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
   2. Install Java (https://www.java.com/en/download/help/download_options.xml)
   3. Install Maven (https://maven.apache.org/install.html or https://www.mkyong.com/maven/how-to-install-maven-in-windows/)
   4. Create/Add your public SSH key to Github (https://help.github.com/articles/adding-a-new-ssh-key-to-your-github-account/)
4. Clone this repository:
   1. Create a new directory somewhere on your local machine
   2. Within the new directory run: `git clone git@github.com:Capgemini-DDG/coding-katas.git`
5. Import the relevant kata project into your chosen IDE
   
## Running The Code

Once you've successfully got setup and you have the project within your IDE, you can do a quick build of the project to make sure you're all setup.

1. Within terminal/cmd/git bash, in the root of the relevant kata project run:
   1. `mvn clean test`
   
This should fail with an assertion error: `java.lang.AssertionError: Implement Me!`

If that's the case, you're all setup and ready to code!
   
