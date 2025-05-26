amount = int(input("Enter the amount: "))
balance = int(input("Enter the balance: "))

if amount > balance:
    print("Insufficient Funds.")

elif amount % 100 != 0:
    print("Amount should be a multiple of 100.")

else:
    print("Transaction Successful.")

print("final:", amount, balance)
