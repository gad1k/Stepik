sudo ln -sf /home/box/web/etc/nginx.conf /etc/nginx/sites-enabled/default
sudo /etc/init.d/nginx restart
sudo ln -sf /home/box/web/etc/gunicorn-wsgi.conf /etc/gunicorn.d/gunicorn-wsgi.conf
sudo ln -sf /home/box/web/etc/gunicorn-django.conf /etc/gunicorn.d/gunicorn-django.conf
cd ~/web/ask
sudo gunicorn -b 0.0.0.0:8000 --access-logfile acc.log --error-logfile err.log ask.wsgi:application &
sudo /etc/init.d/mysql start
mysql -uroot -e "create database web;"
mysql -uroot -e "create user 'box'@'localhost' identified by 'box';"
mysql -uroot -e "grant all privileges on web.* to 'box'@'localhost';"
python3 manage.py makemigrations qa
python3 manage.py migrate