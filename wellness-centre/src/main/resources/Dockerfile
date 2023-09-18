# Use the official MongoDB image from Docker Hub
FROM mongo:latest

# Expose the default MongoDB port
EXPOSE 27017

# Set a custom data directory (optional)
 VOLUME ["/data/db"]

# Set environment variables (optional)
# ENV MONGO_INITDB_ROOT_USERNAME=admin
# ENV MONGO_INITDB_ROOT_PASSWORD=password
 ENV MONGO_INITDB_DATABASE=wellness-centre

# Start MongoDB
CMD ["mongod"]
