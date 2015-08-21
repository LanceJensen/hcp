What: HTTP Copy Utility allows you to host your file system for copying on the intranet/internet.

How to build:
	1.  Download the project from GitHub:
	2.  Run maven command goals clean and install i.e. "mvn clean install" in the same directory as the project pom.xml.
	
How to download:
	1.  Simply pull down from GitHub using your favorite browser from:
	
How to use:
	1. Start the server. i.e. "java -jar hcp-1.0.0.jar"	// Works on Mac/Window/*nix OS's
	2. Find out the web server hostname at startup.
		a. By default the server comes up on localhost:7777.  You may ask for the root page to get the server ip/port as well...
		b. When remotely referencing the system be sure to use the ip address of the system the server is on. ex 192.168.56.1:7777
	3. Use your favorite http client to download files from the remote file system.  Both examples a and b below are equivalent.
		a. wget 192.168.56.1:7777/C:\path\to\file.txt
		b. wget 192.168.56.1:7777/C:/path/to/file.txt

		