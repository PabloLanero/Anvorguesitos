FROM nginx:latest

# Primero copiamos la config personalizada
COPY default.conf /etc/nginx/conf.d/default.conf

# Copiamos solo el directorio HTML en la ubicación correcta
COPY HTML /usr/share/nginx/html/HTML

EXPOSE 80