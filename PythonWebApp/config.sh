sudo apt update
sudo apt install -y python3.5
sudo rm /usr/bin/python3
sudo ln -sf /usr/bin/python3.5 /usr/bin/python3
sudo pip3 install django==2.1
sudo pip3 install gunicorn==17.5