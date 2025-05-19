FROM nginx:latest

# Primero copiamos la config personalizada
COPY default.conf /etc/nginx/conf.d/default.conf

# Copiamos solo el directorio HTML en la ubicación correcta
COPY . /usr/share/nginx/html/

EXPOSE 80