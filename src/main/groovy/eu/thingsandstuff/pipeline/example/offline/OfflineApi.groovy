package eu.thingsandstuff.pipeline.example.offline

class OfflineApi {

    public static final String API = '''
[
  {
    "id": 44528141,
    "name": "aggregatr.io",
    "full_name": "uservices-hackathon/aggregatr.io",
    "owner": {
      "login": "uservices-hackathon",
      "id": 15193736,
      "avatar_url": "https://avatars.githubusercontent.com/u/15193736?v=3",
      "gravatar_id": "",
      "url": "https://api.github.com/users/uservices-hackathon",
      "html_url": "https://github.com/uservices-hackathon",
      "followers_url": "https://api.github.com/users/uservices-hackathon/followers",
      "following_url": "https://api.github.com/users/uservices-hackathon/following{/other_user}",
      "gists_url": "https://api.github.com/users/uservices-hackathon/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/uservices-hackathon/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/uservices-hackathon/subscriptions",
      "organizations_url": "https://api.github.com/users/uservices-hackathon/orgs",
      "repos_url": "https://api.github.com/users/uservices-hackathon/repos",
      "events_url": "https://api.github.com/users/uservices-hackathon/events{/privacy}",
      "received_events_url": "https://api.github.com/users/uservices-hackathon/received_events",
      "type": "Organization",
      "site_admin": false
    },
    "private": false,
    "html_url": "https://github.com/uservices-hackathon/aggregatr.io",
    "description": null,
    "fork": false,
    "url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io",
    "forks_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/forks",
    "keys_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/keys{/key_id}",
    "collaborators_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/collaborators{/collaborator}",
    "teams_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/teams",
    "hooks_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/hooks",
    "issue_events_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/issues/events{/number}",
    "events_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/events",
    "assignees_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/assignees{/user}",
    "branches_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/branches{/branch}",
    "tags_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/tags",
    "blobs_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/git/blobs{/sha}",
    "git_tags_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/git/tags{/sha}",
    "git_refs_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/git/refs{/sha}",
    "trees_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/git/trees{/sha}",
    "statuses_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/statuses/{sha}",
    "languages_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/languages",
    "stargazers_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/stargazers",
    "contributors_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/contributors",
    "subscribers_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/subscribers",
    "subscription_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/subscription",
    "commits_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/commits{/sha}",
    "git_commits_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/git/commits{/sha}",
    "comments_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/comments{/number}",
    "issue_comment_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/issues/comments{/number}",
    "contents_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/contents/{+path}",
    "compare_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/compare/{base}...{head}",
    "merges_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/merges",
    "archive_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/{archive_format}{/ref}",
    "downloads_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/downloads",
    "issues_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/issues{/number}",
    "pulls_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/pulls{/number}",
    "milestones_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/notifications{?since,all,participating}",
    "labels_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/labels{/name}",
    "releases_url": "https://api.github.com/repos/uservices-hackathon/aggregatr.io/releases{/id}",
    "created_at": "2015-10-19T10:45:19Z",
    "updated_at": "2015-10-19T10:45:55Z",
    "pushed_at": "2015-10-20T09:12:35Z",
    "git_url": "git://github.com/uservices-hackathon/aggregatr.io.git",
    "ssh_url": "git@github.com:uservices-hackathon/aggregatr.io.git",
    "clone_url": "https://github.com/uservices-hackathon/aggregatr.io.git",
    "svn_url": "https://github.com/uservices-hackathon/aggregatr.io",
    "homepage": null,
    "size": 0,
    "stargazers_count": 0,
    "watchers_count": 0,
    "language": "Java",
    "has_issues": true,
    "has_downloads": true,
    "has_wiki": true,
    "has_pages": false,
    "forks_count": 0,
    "mirror_url": null,
    "open_issues_count": 0,
    "forks": 0,
    "open_issues": 0,
    "watchers": 0,
    "default_branch": "master",
    "permissions": {
      "admin": false,
      "push": false,
      "pull": true
    }
  },
  {
    "id": 44528142,
    "name": "butelkatr.io",
    "full_name": "uservices-hackathon/butelkatr.io",
    "owner": {
      "login": "uservices-hackathon",
      "id": 15193736,
      "avatar_url": "https://avatars.githubusercontent.com/u/15193736?v=3",
      "gravatar_id": "",
      "url": "https://api.github.com/users/uservices-hackathon",
      "html_url": "https://github.com/uservices-hackathon",
      "followers_url": "https://api.github.com/users/uservices-hackathon/followers",
      "following_url": "https://api.github.com/users/uservices-hackathon/following{/other_user}",
      "gists_url": "https://api.github.com/users/uservices-hackathon/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/uservices-hackathon/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/uservices-hackathon/subscriptions",
      "organizations_url": "https://api.github.com/users/uservices-hackathon/orgs",
      "repos_url": "https://api.github.com/users/uservices-hackathon/repos",
      "events_url": "https://api.github.com/users/uservices-hackathon/events{/privacy}",
      "received_events_url": "https://api.github.com/users/uservices-hackathon/received_events",
      "type": "Organization",
      "site_admin": false
    },
    "private": false,
    "html_url": "https://github.com/uservices-hackathon/butelkatr.io",
    "description": null,
    "fork": false,
    "url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io",
    "forks_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/forks",
    "keys_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/keys{/key_id}",
    "collaborators_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/collaborators{/collaborator}",
    "teams_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/teams",
    "hooks_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/hooks",
    "issue_events_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/issues/events{/number}",
    "events_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/events",
    "assignees_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/assignees{/user}",
    "branches_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/branches{/branch}",
    "tags_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/tags",
    "blobs_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/git/blobs{/sha}",
    "git_tags_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/git/tags{/sha}",
    "git_refs_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/git/refs{/sha}",
    "trees_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/git/trees{/sha}",
    "statuses_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/statuses/{sha}",
    "languages_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/languages",
    "stargazers_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/stargazers",
    "contributors_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/contributors",
    "subscribers_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/subscribers",
    "subscription_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/subscription",
    "commits_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/commits{/sha}",
    "git_commits_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/git/commits{/sha}",
    "comments_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/comments{/number}",
    "issue_comment_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/issues/comments{/number}",
    "contents_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/contents/{+path}",
    "compare_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/compare/{base}...{head}",
    "merges_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/merges",
    "archive_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/{archive_format}{/ref}",
    "downloads_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/downloads",
    "issues_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/issues{/number}",
    "pulls_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/pulls{/number}",
    "milestones_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/notifications{?since,all,participating}",
    "labels_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/labels{/name}",
    "releases_url": "https://api.github.com/repos/uservices-hackathon/butelkatr.io/releases{/id}",
    "created_at": "2015-10-19T10:45:20Z",
    "updated_at": "2015-10-19T10:45:58Z",
    "pushed_at": "2015-10-20T09:16:36Z",
    "git_url": "git://github.com/uservices-hackathon/butelkatr.io.git",
    "ssh_url": "git@github.com:uservices-hackathon/butelkatr.io.git",
    "clone_url": "https://github.com/uservices-hackathon/butelkatr.io.git",
    "svn_url": "https://github.com/uservices-hackathon/butelkatr.io",
    "homepage": null,
    "size": 0,
    "stargazers_count": 0,
    "watchers_count": 0,
    "language": "Java",
    "has_issues": true,
    "has_downloads": true,
    "has_wiki": true,
    "has_pages": false,
    "forks_count": 0,
    "mirror_url": null,
    "open_issues_count": 0,
    "forks": 0,
    "open_issues": 0,
    "watchers": 0,
    "default_branch": "master",
    "permissions": {
      "admin": false,
      "push": false,
      "pull": true
    }
  },
  {
    "id": 44528143,
    "name": "dojrzewatr.io",
    "full_name": "uservices-hackathon/dojrzewatr.io",
    "owner": {
      "login": "uservices-hackathon",
      "id": 15193736,
      "avatar_url": "https://avatars.githubusercontent.com/u/15193736?v=3",
      "gravatar_id": "",
      "url": "https://api.github.com/users/uservices-hackathon",
      "html_url": "https://github.com/uservices-hackathon",
      "followers_url": "https://api.github.com/users/uservices-hackathon/followers",
      "following_url": "https://api.github.com/users/uservices-hackathon/following{/other_user}",
      "gists_url": "https://api.github.com/users/uservices-hackathon/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/uservices-hackathon/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/uservices-hackathon/subscriptions",
      "organizations_url": "https://api.github.com/users/uservices-hackathon/orgs",
      "repos_url": "https://api.github.com/users/uservices-hackathon/repos",
      "events_url": "https://api.github.com/users/uservices-hackathon/events{/privacy}",
      "received_events_url": "https://api.github.com/users/uservices-hackathon/received_events",
      "type": "Organization",
      "site_admin": false
    },
    "private": false,
    "html_url": "https://github.com/uservices-hackathon/dojrzewatr.io",
    "description": null,
    "fork": false,
    "url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io",
    "forks_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/forks",
    "keys_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/keys{/key_id}",
    "collaborators_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/collaborators{/collaborator}",
    "teams_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/teams",
    "hooks_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/hooks",
    "issue_events_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/issues/events{/number}",
    "events_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/events",
    "assignees_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/assignees{/user}",
    "branches_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/branches{/branch}",
    "tags_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/tags",
    "blobs_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/git/blobs{/sha}",
    "git_tags_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/git/tags{/sha}",
    "git_refs_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/git/refs{/sha}",
    "trees_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/git/trees{/sha}",
    "statuses_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/statuses/{sha}",
    "languages_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/languages",
    "stargazers_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/stargazers",
    "contributors_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/contributors",
    "subscribers_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/subscribers",
    "subscription_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/subscription",
    "commits_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/commits{/sha}",
    "git_commits_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/git/commits{/sha}",
    "comments_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/comments{/number}",
    "issue_comment_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/issues/comments{/number}",
    "contents_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/contents/{+path}",
    "compare_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/compare/{base}...{head}",
    "merges_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/merges",
    "archive_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/{archive_format}{/ref}",
    "downloads_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/downloads",
    "issues_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/issues{/number}",
    "pulls_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/pulls{/number}",
    "milestones_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/notifications{?since,all,participating}",
    "labels_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/labels{/name}",
    "releases_url": "https://api.github.com/repos/uservices-hackathon/dojrzewatr.io/releases{/id}",
    "created_at": "2015-10-19T10:45:21Z",
    "updated_at": "2015-10-19T10:46:00Z",
    "pushed_at": "2015-10-20T09:21:23Z",
    "git_url": "git://github.com/uservices-hackathon/dojrzewatr.io.git",
    "ssh_url": "git@github.com:uservices-hackathon/dojrzewatr.io.git",
    "clone_url": "https://github.com/uservices-hackathon/dojrzewatr.io.git",
    "svn_url": "https://github.com/uservices-hackathon/dojrzewatr.io",
    "homepage": null,
    "size": 0,
    "stargazers_count": 0,
    "watchers_count": 0,
    "language": "Java",
    "has_issues": true,
    "has_downloads": true,
    "has_wiki": true,
    "has_pages": false,
    "forks_count": 0,
    "mirror_url": null,
    "open_issues_count": 0,
    "forks": 0,
    "open_issues": 0,
    "watchers": 0,
    "default_branch": "master",
    "permissions": {
      "admin": false,
      "push": false,
      "pull": true
    }
  },
  {
    "id": 44528144,
    "name": "prezentatr.io",
    "full_name": "uservices-hackathon/prezentatr.io",
    "owner": {
      "login": "uservices-hackathon",
      "id": 15193736,
      "avatar_url": "https://avatars.githubusercontent.com/u/15193736?v=3",
      "gravatar_id": "",
      "url": "https://api.github.com/users/uservices-hackathon",
      "html_url": "https://github.com/uservices-hackathon",
      "followers_url": "https://api.github.com/users/uservices-hackathon/followers",
      "following_url": "https://api.github.com/users/uservices-hackathon/following{/other_user}",
      "gists_url": "https://api.github.com/users/uservices-hackathon/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/uservices-hackathon/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/uservices-hackathon/subscriptions",
      "organizations_url": "https://api.github.com/users/uservices-hackathon/orgs",
      "repos_url": "https://api.github.com/users/uservices-hackathon/repos",
      "events_url": "https://api.github.com/users/uservices-hackathon/events{/privacy}",
      "received_events_url": "https://api.github.com/users/uservices-hackathon/received_events",
      "type": "Organization",
      "site_admin": false
    },
    "private": false,
    "html_url": "https://github.com/uservices-hackathon/prezentatr.io",
    "description": null,
    "fork": false,
    "url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io",
    "forks_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/forks",
    "keys_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/keys{/key_id}",
    "collaborators_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/collaborators{/collaborator}",
    "teams_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/teams",
    "hooks_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/hooks",
    "issue_events_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/issues/events{/number}",
    "events_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/events",
    "assignees_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/assignees{/user}",
    "branches_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/branches{/branch}",
    "tags_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/tags",
    "blobs_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/git/blobs{/sha}",
    "git_tags_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/git/tags{/sha}",
    "git_refs_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/git/refs{/sha}",
    "trees_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/git/trees{/sha}",
    "statuses_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/statuses/{sha}",
    "languages_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/languages",
    "stargazers_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/stargazers",
    "contributors_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/contributors",
    "subscribers_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/subscribers",
    "subscription_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/subscription",
    "commits_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/commits{/sha}",
    "git_commits_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/git/commits{/sha}",
    "comments_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/comments{/number}",
    "issue_comment_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/issues/comments{/number}",
    "contents_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/contents/{+path}",
    "compare_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/compare/{base}...{head}",
    "merges_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/merges",
    "archive_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/{archive_format}{/ref}",
    "downloads_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/downloads",
    "issues_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/issues{/number}",
    "pulls_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/pulls{/number}",
    "milestones_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/notifications{?since,all,participating}",
    "labels_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/labels{/name}",
    "releases_url": "https://api.github.com/repos/uservices-hackathon/prezentatr.io/releases{/id}",
    "created_at": "2015-10-19T10:45:22Z",
    "updated_at": "2015-10-19T10:46:04Z",
    "pushed_at": "2015-10-20T09:33:21Z",
    "git_url": "git://github.com/uservices-hackathon/prezentatr.io.git",
    "ssh_url": "git@github.com:uservices-hackathon/prezentatr.io.git",
    "clone_url": "https://github.com/uservices-hackathon/prezentatr.io.git",
    "svn_url": "https://github.com/uservices-hackathon/prezentatr.io",
    "homepage": null,
    "size": 0,
    "stargazers_count": 0,
    "watchers_count": 0,
    "language": "Groovy",
    "has_issues": true,
    "has_downloads": true,
    "has_wiki": true,
    "has_pages": false,
    "forks_count": 0,
    "mirror_url": null,
    "open_issues_count": 0,
    "forks": 0,
    "open_issues": 0,
    "watchers": 0,
    "default_branch": "master",
    "permissions": {
      "admin": false,
      "push": false,
      "pull": true
    }
  },
  {
    "id": 44528186,
    "name": "properties",
    "full_name": "uservices-hackathon/properties",
    "owner": {
      "login": "uservices-hackathon",
      "id": 15193736,
      "avatar_url": "https://avatars.githubusercontent.com/u/15193736?v=3",
      "gravatar_id": "",
      "url": "https://api.github.com/users/uservices-hackathon",
      "html_url": "https://github.com/uservices-hackathon",
      "followers_url": "https://api.github.com/users/uservices-hackathon/followers",
      "following_url": "https://api.github.com/users/uservices-hackathon/following{/other_user}",
      "gists_url": "https://api.github.com/users/uservices-hackathon/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/uservices-hackathon/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/uservices-hackathon/subscriptions",
      "organizations_url": "https://api.github.com/users/uservices-hackathon/orgs",
      "repos_url": "https://api.github.com/users/uservices-hackathon/repos",
      "events_url": "https://api.github.com/users/uservices-hackathon/events{/privacy}",
      "received_events_url": "https://api.github.com/users/uservices-hackathon/received_events",
      "type": "Organization",
      "site_admin": false
    },
    "private": false,
    "html_url": "https://github.com/uservices-hackathon/properties",
    "description": null,
    "fork": false,
    "url": "https://api.github.com/repos/uservices-hackathon/properties",
    "forks_url": "https://api.github.com/repos/uservices-hackathon/properties/forks",
    "keys_url": "https://api.github.com/repos/uservices-hackathon/properties/keys{/key_id}",
    "collaborators_url": "https://api.github.com/repos/uservices-hackathon/properties/collaborators{/collaborator}",
    "teams_url": "https://api.github.com/repos/uservices-hackathon/properties/teams",
    "hooks_url": "https://api.github.com/repos/uservices-hackathon/properties/hooks",
    "issue_events_url": "https://api.github.com/repos/uservices-hackathon/properties/issues/events{/number}",
    "events_url": "https://api.github.com/repos/uservices-hackathon/properties/events",
    "assignees_url": "https://api.github.com/repos/uservices-hackathon/properties/assignees{/user}",
    "branches_url": "https://api.github.com/repos/uservices-hackathon/properties/branches{/branch}",
    "tags_url": "https://api.github.com/repos/uservices-hackathon/properties/tags",
    "blobs_url": "https://api.github.com/repos/uservices-hackathon/properties/git/blobs{/sha}",
    "git_tags_url": "https://api.github.com/repos/uservices-hackathon/properties/git/tags{/sha}",
    "git_refs_url": "https://api.github.com/repos/uservices-hackathon/properties/git/refs{/sha}",
    "trees_url": "https://api.github.com/repos/uservices-hackathon/properties/git/trees{/sha}",
    "statuses_url": "https://api.github.com/repos/uservices-hackathon/properties/statuses/{sha}",
    "languages_url": "https://api.github.com/repos/uservices-hackathon/properties/languages",
    "stargazers_url": "https://api.github.com/repos/uservices-hackathon/properties/stargazers",
    "contributors_url": "https://api.github.com/repos/uservices-hackathon/properties/contributors",
    "subscribers_url": "https://api.github.com/repos/uservices-hackathon/properties/subscribers",
    "subscription_url": "https://api.github.com/repos/uservices-hackathon/properties/subscription",
    "commits_url": "https://api.github.com/repos/uservices-hackathon/properties/commits{/sha}",
    "git_commits_url": "https://api.github.com/repos/uservices-hackathon/properties/git/commits{/sha}",
    "comments_url": "https://api.github.com/repos/uservices-hackathon/properties/comments{/number}",
    "issue_comment_url": "https://api.github.com/repos/uservices-hackathon/properties/issues/comments{/number}",
    "contents_url": "https://api.github.com/repos/uservices-hackathon/properties/contents/{+path}",
    "compare_url": "https://api.github.com/repos/uservices-hackathon/properties/compare/{base}...{head}",
    "merges_url": "https://api.github.com/repos/uservices-hackathon/properties/merges",
    "archive_url": "https://api.github.com/repos/uservices-hackathon/properties/{archive_format}{/ref}",
    "downloads_url": "https://api.github.com/repos/uservices-hackathon/properties/downloads",
    "issues_url": "https://api.github.com/repos/uservices-hackathon/properties/issues{/number}",
    "pulls_url": "https://api.github.com/repos/uservices-hackathon/properties/pulls{/number}",
    "milestones_url": "https://api.github.com/repos/uservices-hackathon/properties/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/uservices-hackathon/properties/notifications{?since,all,participating}",
    "labels_url": "https://api.github.com/repos/uservices-hackathon/properties/labels{/name}",
    "releases_url": "https://api.github.com/repos/uservices-hackathon/properties/releases{/id}",
    "created_at": "2015-10-19T10:46:26Z",
    "updated_at": "2015-10-19T10:46:26Z",
    "pushed_at": "2015-10-20T08:52:46Z",
    "git_url": "git://github.com/uservices-hackathon/properties.git",
    "ssh_url": "git@github.com:uservices-hackathon/properties.git",
    "clone_url": "https://github.com/uservices-hackathon/properties.git",
    "svn_url": "https://github.com/uservices-hackathon/properties",
    "homepage": null,
    "size": 0,
    "stargazers_count": 0,
    "watchers_count": 0,
    "language": null,
    "has_issues": true,
    "has_downloads": true,
    "has_wiki": true,
    "has_pages": false,
    "forks_count": 0,
    "mirror_url": null,
    "open_issues_count": 0,
    "forks": 0,
    "open_issues": 0,
    "watchers": 0,
    "default_branch": "master",
    "permissions": {
      "admin": false,
      "push": false,
      "pull": true
    }
  },
  {
    "id": 44591927,
    "name": "jenkins-pipeline-dsl-example",
    "full_name": "uservices-hackathon/jenkins-pipeline-dsl-example",
    "owner": {
      "login": "uservices-hackathon",
      "id": 15193736,
      "avatar_url": "https://avatars.githubusercontent.com/u/15193736?v=3",
      "gravatar_id": "",
      "url": "https://api.github.com/users/uservices-hackathon",
      "html_url": "https://github.com/uservices-hackathon",
      "followers_url": "https://api.github.com/users/uservices-hackathon/followers",
      "following_url": "https://api.github.com/users/uservices-hackathon/following{/other_user}",
      "gists_url": "https://api.github.com/users/uservices-hackathon/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/uservices-hackathon/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/uservices-hackathon/subscriptions",
      "organizations_url": "https://api.github.com/users/uservices-hackathon/orgs",
      "repos_url": "https://api.github.com/users/uservices-hackathon/repos",
      "events_url": "https://api.github.com/users/uservices-hackathon/events{/privacy}",
      "received_events_url": "https://api.github.com/users/uservices-hackathon/received_events",
      "type": "Organization",
      "site_admin": false
    },
    "private": false,
    "html_url": "https://github.com/uservices-hackathon/jenkins-pipeline-dsl-example",
    "description": "",
    "fork": true,
    "url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example",
    "forks_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/forks",
    "keys_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/keys{/key_id}",
    "collaborators_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/collaborators{/collaborator}",
    "teams_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/teams",
    "hooks_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/hooks",
    "issue_events_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/issues/events{/number}",
    "events_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/events",
    "assignees_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/assignees{/user}",
    "branches_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/branches{/branch}",
    "tags_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/tags",
    "blobs_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/git/blobs{/sha}",
    "git_tags_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/git/tags{/sha}",
    "git_refs_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/git/refs{/sha}",
    "trees_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/git/trees{/sha}",
    "statuses_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/statuses/{sha}",
    "languages_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/languages",
    "stargazers_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/stargazers",
    "contributors_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/contributors",
    "subscribers_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/subscribers",
    "subscription_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/subscription",
    "commits_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/commits{/sha}",
    "git_commits_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/git/commits{/sha}",
    "comments_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/comments{/number}",
    "issue_comment_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/issues/comments{/number}",
    "contents_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/contents/{+path}",
    "compare_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/compare/{base}...{head}",
    "merges_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/merges",
    "archive_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/{archive_format}{/ref}",
    "downloads_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/downloads",
    "issues_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/issues{/number}",
    "pulls_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/pulls{/number}",
    "milestones_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/notifications{?since,all,participating}",
    "labels_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/labels{/name}",
    "releases_url": "https://api.github.com/repos/uservices-hackathon/jenkins-pipeline-dsl-example/releases{/id}",
    "created_at": "2015-10-20T08:17:20Z",
    "updated_at": "2015-10-20T08:17:21Z",
    "pushed_at": "2015-10-18T23:39:06Z",
    "git_url": "git://github.com/uservices-hackathon/jenkins-pipeline-dsl-example.git",
    "ssh_url": "git@github.com:uservices-hackathon/jenkins-pipeline-dsl-example.git",
    "clone_url": "https://github.com/uservices-hackathon/jenkins-pipeline-dsl-example.git",
    "svn_url": "https://github.com/uservices-hackathon/jenkins-pipeline-dsl-example",
    "homepage": null,
    "size": 0,
    "stargazers_count": 0,
    "watchers_count": 0,
    "language": "Groovy",
    "has_issues": false,
    "has_downloads": true,
    "has_wiki": true,
    "has_pages": false,
    "forks_count": 0,
    "mirror_url": null,
    "open_issues_count": 0,
    "forks": 0,
    "open_issues": 0,
    "watchers": 0,
    "default_branch": "master",
    "permissions": {
      "admin": false,
      "push": false,
      "pull": true
    }
  }
]
'''
}
