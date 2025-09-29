import pandas as pd

data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}
	
df = pd.DataFrame(data)
df.to_csv("./activities/sample.csv",index=False)

input_data = pd.read_csv("./activities/sample.csv")

print(input_data["Usernames"])
print(input_data["Usernames"][1], input_data["Passwords"][1])
print (input_data.sort_values("Usernames"))
print(input_data.sort_values("Passwords", ascending=False))
