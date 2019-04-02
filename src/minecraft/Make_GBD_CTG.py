## for i in sys.path: print(i)
import sys
sys.path.insert(0, "/Users/junlee/Python/Minecraft/py3minepimaster")

from mcpi.minecraft import Minecraft
import time

mc = Minecraft.create(); mc.postToChat("start gold hand")
gold = 41; i = 0

while(True):
    blockInf = mc.events.pollBlockHits()

    if len(blockInf) > 0 :
        block = blockInf[0]
        bID = mc.getBlock(block.pos)
        mc.postToChat("x : %d, y : %d, z : %d" % (block.pos.x, block.pos.y, block.pos.z))
        mc.postToChat("Block ID : %d" % (bID))
        mc.postToChat("face : %d" % (block.face))
        blockInf = []

        mc.setBlock(block.pos.x, block.pos.y, block.pos.z, gold)
        i += 1
        mc.postToChat("%d gold" %(i))

        if (i==10):
            break

mc.postToChat("finish gold hand")