FROM node:11.6.0-alpine AS builder
COPY . ./countryPhone
WORKDIR /countryPhone
RUN npm i
RUN $(npm bin)/ng build --prod

FROM nginx:1.15.8-alpine
COPY --from=builder /countryPhone/dist/countryPhone/ /usr/share/nginx/html