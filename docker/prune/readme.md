
## $ docker system df
'''
TYPE                TOTAL               ACTIVE              SIZE                RECLAIMABLE
Images              153                 16                  9.663GB             8.626GB (89%)
Containers          32                  7                   216B                216B (100%)
Local Volumes       59                  8                   3.693GB             3.403GB (92%)
Build Cache         0                   0                   0B                  0B
'''

## $ docker image ls -f "dangling=true"
'''
REPOSITORY          TAG                 IMAGE ID            CREATED             SIZE
prom/prometheus     <none>              b205ccdd28d3        2 months ago        145MB
prom/prometheus     <none>              f73e06535383        2 months ago        142MB
prom/prometheus     <none>              9f345bfa8fef        3 months ago        142MB
prom/prometheus     <none>              39d1866a438a        4 months ago        142MB
prom/prometheus     <none>              de242295e225        5 months ago        140MB
<none>              <none>              bab0ea6997b1        8 months ago        88.6MB
<none>              <none>              331e9ce74fa2        12 months ago       105MB
prom/prometheus     <none>              a3d30ee5b98b        12 months ago       128MB
<none>              <none>              dced1a07b207        13 months ago       34.3MB
<none>              <none>              5187420e3859        13 months ago       34.3MB
<none>              <none>              fc0297656f04        13 months ago       34.3MB
<none>              <none>              824a0cd02c84        13 months ago       34.3MB
'''

## $ docker image prune
'''
WARNING! This will remove all dangling images.
Are you sure you want to continue? [y/N] y
Deleted Images:
deleted: sha256:824a0cd02c84254d03e322ff3a2128dfb6c600ac2e03568de0282649edd9a02d
deleted: sha256:1b675c0f4466c72f4a9d8e3e52f32db40392108b482be20af3de9aeeec44712e
deleted: sha256:c724183242d253a0aad327e5a565b119e616a930212f61ef7b8706585dab79c1
deleted: sha256:174608f49ce9355536df8f06dd877a1982369dd54b840fd05de680adeed1b939
...
deleted: sha256:b0a173384a408870c3fa75206fac534265d5c93aaaeceadf4f53fa7a1f5b7248
deleted: sha256:84220dbf99c78dfcfb7698d0222d6fe4c5a3876bd8a914a2ac59d7a9a5ab0235
deleted: sha256:d33d63990d3e834efb82f833749122aae2d80bac40585e1b02c309eef0b819b8
deleted: sha256:7fc5b6fcfc2e6adf2fa3b4db649cc2411ebe2d0ba616f0ffed81cf2b4d9c3272
deleted: sha256:a27ad51e072f36a36d8538afa7ec54a2e8a9b1af5e945ad272f7fe29c155bb4e
deleted: sha256:1d9880cdfa0094467ada398cbf6eb1559f447c119ff98fe5ec8e9c71d313bc52
deleted: sha256:2aadb66e735072ffd4689a68109737d8f7f66dce84f5ede4325c6ea8318c12d6
deleted: sha256:8351026b9a4dc373a9b0ffa6fce248dc1e5f0bc40a682599fe02ae1498ea014f
deleted: sha256:23cb71a2ec6f7e4cc1c228f1c38259503d6cb11f1dd897a0559df5e412076cf2
deleted: sha256:1da8e4c8d30765bea127dc2f11a17bc723b59480f4ab5292edb00eb8eb1d96b1
deleted: sha256:331e9ce74fa26b47e757351b366a1a912fe2b22c3762906b65272484bf7d94fe

Total reclaimed space: 828MB
'''

## $ docker system df
'''
TYPE                TOTAL               ACTIVE              SIZE                RECLAIMABLE
Images              142                 16                  8.835GB             7.798GB (88%)
Containers          32                  7                   216B                216B (100%)
Local Volumes       59                  8                   3.693GB             3.403GB (92%)
Build Cache         0                   0                   0B                  0B
'''

## $ docker volume prune
'''
WARNING! This will remove all local volumes not used by at least one container.
Are you sure you want to continue? [y/N] y
Deleted Volumes:
3be8607bf0b83d88c92403650065b6a1e5188dbf5335ce618b293f7a7585c9c0
5b38274c29737df63b1e10791448f0a50712b783dfc3c5c388b3ab8584a1c6b0
...
199ad9d2a054b52935d81a5fe27368e87666d6fe4b359cfe2830983aa9768737
637495b228fcf2d9f2dc448530669fdf44448804a443ff6aa2ddbb559fbcd038

Total reclaimed space: 3.403GB
'''

## $ docker system df
'''
TYPE                TOTAL               ACTIVE              SIZE                RECLAIMABLE
Images              142                 16                  8.835GB             7.798GB (88%)
Containers          33                  8                   216B                216B (100%)
Local Volumes       8                   8                   289.6MB             0B (0%)
Build Cache         0                   0                   0B                  0B
'''

## docker system prune
'''
WARNING! This will remove:
  - all stopped containers
  - all networks not used by at least one container
  - all dangling images
  - all dangling build cache

Are you sure you want to continue? [y/N] y
Deleted Containers:
a1c3e10d433aecab01aba45496086d46eaf75888bb4017614b9c61bc691c794e
2efbe92eb2426f65fdb34d688ca4fc95b4dde9954fc1f5c0a685b099fc587678
...
31dd6a04032ec7d53c2379a7dc902fa5236e4ea24382e8791c3059239a44d035
fd4a1e9439947e86136514f7b877592791085c4c2cda10084e4cac65b99012e8

Deleted Images:
deleted: sha256:bab0ea6997b1000207d351758f45e24c69dbba48109a6e0aeb28750e2d899b02
...
deleted: sha256:02a8a9f55937c6265e2100f4964956e7417f5233e4eeb88c4f764596367d804a
deleted: sha256:d2fa1984326ac5a0a3db51f17de90fd87b6d8077452fcd67528929beb62411d6

Total reclaimed space: 328.8kB
'''

## $ docker system df
'''
TYPE                TOTAL               ACTIVE              SIZE                RECLAIMABLE
Images              141                 6                   8.835GB             8.255GB (93%)
Containers          10                  8                   0B                  0B
Local Volumes       8                   0                   289.6MB             289.6MB (100%)
Build Cache         0                   0                   0B                  0B
'''