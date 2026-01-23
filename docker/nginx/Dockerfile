FROM nginx
WORKDIR /usr/share/nginx/html
RUN mkdir images
COPY docker.png images/docker.png
COPY my.html  .
EXPOSE 80
ENTRYPOINT ["nginx", "-g", "daemon off;"]