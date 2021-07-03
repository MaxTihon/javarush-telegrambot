# Overview
### MVP Scope
As a user, I want to subscribe on group of posts and get notification via telegram-bot every time, when new post, related to group subscriptions, has come.
### How it works
Based on MVP Scope, we can specify next behaviours (after Telegram user subscribes to the bot):

- User can subscribe on group of posts
- User can view list of group subscriptions on which user subscribes
- User can unsubscribe from group of posts
- User can set an inactive bot and do not receive notifications
- User can restart getting notifications

# Deployment
Deployment process as easy as possible:
Required software:
- terminal for running bash scripts
- docker
- docker-compose

to deploy application, switch to needed branch and run bash script:

$ bash start.sh ${bot_username} ${bot_token}

That's all.

# Technological stack
- SpringBoot as a skeleton framework
- Spring Scheduler as a task manager
- MySQL database as a database for saving user and subscription info
- Flyway database migration tool
- Telegram-bot SpringBoot starter
- Spring Data starter
- Unirest - lib for working with REST calls
## Release Notes
Can be found in [RELEASE_NOTES](RELEASE_NOTES.md).

## Authors
* Maksim Tikhonenko - [MaxTihon](https://github.com/MaxTihon)

## Contributing
Please, follow [Contributing](CONTRIBUTING.md) page.

## Code of Conduct
Please, follow [Code of Conduct](CODE_OF_CONDUCT.md) page.

## License
This project is Apache License 2.0 - see the [LICENSE](LICENSE) file for details
