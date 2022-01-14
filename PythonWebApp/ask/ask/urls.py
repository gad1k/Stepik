from django.conf.urls import url
from qa.views import test, index, popular, question, ask, signup, signin

urlpatterns = [
    url(r"^$", index),
    url(r"^login/.*$", signin),
    url(r"^signup/.*", signup),
    url(r"^question/(?P<num>\d+)/$", question),
    url(r"^ask/.*", ask),
    url(r"^popular/.*", popular),
    url(r"^new/.*", test)
]
