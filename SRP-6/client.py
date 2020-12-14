import sys,random#BOB
from socket import *
import regers

sHOST='localhost'
sPORT=8092
sockobj=socket(AF_INET,SOCK_STREAM)
sockobj.connect((sHOST,sPORT))
I='User1'
a=random.randint(1,100)
A=regers.g^a%regers.N


sockobj.send(str.encode(str(I)))
data=sockobj.recv(1024)
print(data)
sockobj.send(str.encode(str(a)))
data=sockobj.recv(1024)
print(data)
sockobj.send(str.encode(str(A)))
data=sockobj.recv(1024)
B=int(data)
u=regers.Hash(A,B)
if u==0:
    connection.close()
print("You loggin")
passw=int(input('Password:'))

x=regers.Hash(regers.s,passw)
if x==regers.x:

    k=regers.k
    g=regers.g
    N=regers.N
    data=sockobj.recv(1024)
    S = ((B - k*((g^x) % N)) ^ (a + (u*x))) % N
    print('Accepted')
    S=int(data)
    K=regers.Hash(S,1)
    sockobj.send(str.encode(str(K)))
    print(K)
    sockobj.close()
else:
    print('Invalid password try next time:')
    sockobj.close()
