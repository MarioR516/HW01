import json
import subprocess
with open("Test.json") as json_file:
    data = json.load(json_file)
    for p in data["Classes"]:
        print("Name: " + p["Name"] + "compiling.")
        subprocess.call(['javac -cp junit-4.13-rc-1.jar'], shell=True)
        for p in data["Classes"]:
            print("Name: " + p["Name"] + "compiled.")
            sub.call('java -cp junit-4.13-rc-1.jar; hamcrest.core_1.3.0.v201303031735.jar'], shell=True)
